package com.crm.aotg.integration.account.service;

import com.crm.aotg.integration.account.dto.*;
import com.crm.aotg.integration.auth.service.CLAOTGAuthService;
import com.crm.aotg.integration.common.dto.*;
import com.crm.aotg.integration.constants.CLConstants;
import com.crm.aotg.integration.utils.CLUtils;
import com.crm.aotg.integration.utils.Log;
import com.google.gson.*;
import com.mashape.unirest.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CLAccountService {

    @Autowired
    private CLAOTGAuthService claotgAuthService;

    @Autowired
    private CLUtils clUtils;

    @Autowired
    private CLAOTGCommon claotgCommon;

    public CLBaseStatusDto createOrUpdateAccount( String accessToken,  String transId,  String ccode,  String userId){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        CLBaseStatusDto clStatus= new CLBaseStatusDto();
        clStatus.setStatus(0);
        clStatus.setMsg("");
        clStatus.setError_msg("Error in AOTG Posting.");

        Log.info("In CreateOrUpdate Account.");
        Log.info("Getting Account Deatails for "+transId);
        CLCRMAccountDto clcrmAccountDto = getAccountInfo(accessToken,transId);
        Log.info("Got Account Deatails : "+gson.toJson(clcrmAccountDto));
        String aotg_accessToken="";
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        Log.info("CRM_URL : "+CRM_URL);
        String AOTG_URL = clUtils.getValueFromPropFile("aotg.url");
        Log.info("AOTG_URL : "+AOTG_URL);
        Long AOTG_THREAD_SLEEP = Long.parseLong(clUtils.getValueFromPropFile("aotg.thread.sleep"));
        Log.info("AOTG_THREAD_SLEEP : "+AOTG_THREAD_SLEEP);
        try {
            if(clcrmAccountDto!=null){
                Log.info("Getting AOTG_ID from Account....");
                String sAOTGId = getAotgIdFromAccountDetails(clcrmAccountDto);
                Log.info("Got AOTG_ID ="+sAOTGId);
                Log.info("Getting AOTG AccessToken...");
                aotg_accessToken=claotgAuthService.getNewAccessToken();
                Log.info("Got AOTG AccessToken :"+aotg_accessToken);
                String sURL = "";

                Log.info("Forming JSON for AOTG Posting...");
                CLAccountDto clAccountDto = new CLAccountDto();
                InvoiceAddress invoiceAddress = new InvoiceAddress();
                DeliverAddress deliverAddress = new DeliverAddress();
                Record acc_records = clcrmAccountDto.getRecords().get(0);

                clAccountDto.setCompanyName(acc_records.getName());
                if(!sAOTGId.equals("")){ clAccountDto.setId(sAOTGId);}
                clAccountDto.setDescription(acc_records.getDescription());
                invoiceAddress.setAddress1(acc_records.getBillingAddress());
                invoiceAddress.setAddress2(acc_records.getBillingCity());
                invoiceAddress.setAddress3(acc_records.getBillingState());
                invoiceAddress.setAddress4(acc_records.getBillingPinCode());
                invoiceAddress.setPhone(acc_records.getsInvoiceContact());
                clAccountDto.setInvoiceAddress(invoiceAddress);
                deliverAddress.setAddress1(acc_records.getShippingAddress());
                deliverAddress.setAddress2(acc_records.getShippingCity());
                deliverAddress.setAddress3(acc_records.getShippingState());
                deliverAddress.setAddress4(acc_records.getShippingPinCode());
                deliverAddress.setPhone(acc_records.getsDeliveryContact());
                clAccountDto.setDeliverAddress(deliverAddress);
                clAccountDto.setCreditTerm(acc_records.getiCreditTerm());
                clAccountDto.setIsActive(true);
                clAccountDto.setRegisterNo(acc_records.getComRegistration());

                String sJSON = gson.toJson(clAccountDto);
                Log.info("Formed JSON for AOTG Posting : "+sJSON);
                HttpResponse<String> aotg_response = null;
                Map<String,String> aotg_headers = new HashMap<String,String>();
                aotg_headers.put("content-type","application/json");
                aotg_headers.put("SOTC_AUTH",aotg_accessToken);

                if(!sAOTGId.equals("")){
                    sURL = AOTG_URL+String.format(CLConstants.AOTG_UPDATE_DEBTOR);
                    Log.info("Updating AOTG Account for ID="+sAOTGId);
                    Log.info("Updating AOTG Account URL="+sURL);
                    aotg_response = clUtils.sendPutRequest(sURL,aotg_headers,sJSON);
                }else{
                    sURL = AOTG_URL+String.format(CLConstants.AOTG_CREATE_DEBTOR);
                    //Log.info("Creating AOTG Account for ID="+sAOTGId);
                    Log.info("Creating AOTG Account URL="+sURL);
                    aotg_response = clUtils.sendPostRequest(sURL,aotg_headers,sJSON);
                }

                Log.info("AOTG Account HTTPResponse==="+aotg_response.getStatus()+","+aotg_response.getStatusText()+","+aotg_response.getBody());
                if(aotg_response.getStatus()==200){
                    Log.info("Account HTTP Request Success..");
                    CLAOTGInitialRequestDto claotgInitialRequestDto = new CLAOTGInitialRequestDto();
                    claotgInitialRequestDto = gson.fromJson(aotg_response.getBody(),CLAOTGInitialRequestDto.class);
                    if(claotgInitialRequestDto!=null){
                        String sRequestName = claotgInitialRequestDto.getName();
                        String sId = claotgInitialRequestDto.getId();
                        if(!sRequestName.equals("") && !sId.equals("")){
                            Log.info("AOTG Checking Request Status..");
                            String sCurrentStatus = "";
                            String sCurrentReqId = "";
                            Log.info("AOTG Checking Request Status Initila Variables CurrecntReqStatua and CurrentReqId are blank..");
                            String sURL_REQ_STATUS = AOTG_URL+String.format(CLConstants.AOTG_CHECKSTATUS,sId);
                            do{
                                Thread.sleep(AOTG_THREAD_SLEEP);
                                CLAOTGRequestStatusDto claotgRequestStatusDto = claotgCommon.getRequestStatus(sURL_REQ_STATUS, aotg_headers);
                                if(claotgRequestStatusDto!=null){
                                    sCurrentStatus = claotgRequestStatusDto.getStatus();
                                    sCurrentReqId = claotgRequestStatusDto.getRequestId();
                                }
                            }while(sCurrentStatus.equals(CLConstants.AOTG_STATUS_INQUEUE) || sCurrentStatus.equals(CLConstants.AOTG_STATUS_POCESSING));
                            Log.info(String.format("AOTG Current Status == {ReqStatus:%s,ReqId:%s}",sCurrentStatus,sCurrentReqId));
                            if(sCurrentStatus.equals(CLConstants.AOTG_STATUS_COMPLETED)){
                                try{
                                    CLAOTGResultDto claotgResultDto = new CLAOTGResultDto();
                                    String sURL_REQ_RESULT = AOTG_URL+String.format(CLConstants.AOTG_RESULT,sRequestName,sCurrentReqId);
                                    Log.info("AOTG_Result Request on URL =="+sURL_REQ_RESULT);
                                    claotgResultDto = claotgCommon.getRequestResult(sURL_REQ_RESULT,aotg_headers);
                                    //String sResultJson = claotgResultDto.getResultJson().replaceAll("\"","");
                                    String sResultJson = claotgResultDto.getResultJson();
                                    Log.info("ResultJSON_COMPLETED=====>" + sResultJson);
                                    JsonObject objJson = (new JsonParser()).parse(sResultJson).getAsJsonObject();
                                    String sNewAotgId = objJson.get("Id").toString();
                                    String sNewAccNo = objJson.get("AccNo").toString();
                                    Log.info("AOTG ID GENERATED : " + sNewAotgId);

                                    if(!sAOTGId.equals("")){
                                        clStatus.setStatus(1);
                                        clStatus.setMsg("AOTG Record Updated.");
                                        clStatus.setError_msg("");
                                        return clStatus;
                                    }

                                    if(!sNewAotgId.equals("")){
                                        boolean bIsAccUpdated = updateAccountWithAOTGId(transId,accessToken,sNewAotgId,sNewAccNo);

                                        clStatus.setStatus(bIsAccUpdated?1:0);
                                        clStatus.setMsg(bIsAccUpdated?"AOTG Record Created.":"");
                                        clStatus.setError_msg(bIsAccUpdated?"":"Error while creating Aotg Records.");
                                        return clStatus;
                                    }
                                }catch (Exception ex){
                                    ex.printStackTrace();
                                }

                            }else if(sCurrentStatus.equals(CLConstants.AOTG_STATUS_FAILED)){
                                try{
                                    CLAOTGResultDto claotgResultDto = new CLAOTGResultDto();
                                    String sURL_REQ_RESULT = AOTG_URL+String.format(CLConstants.AOTG_RESULT,sRequestName,sCurrentReqId);
                                    Log.info("AOTG_Result Request on URL =="+sURL_REQ_RESULT);
                                    claotgResultDto = claotgCommon.getRequestResult(sURL_REQ_RESULT,aotg_headers);
                                    //String sResultJson = claotgResultDto.getResultJson().replaceAll("\"","");
                                    String sResultJson = claotgResultDto.getResultJson();
                                    Log.info("ResultJSON_FAILED=====>" + sResultJson);
                                    Log.info("AOTG_ACCOUNT_POSTING_FAILED_JSON: " + sResultJson);
                                    //JsonObject objJson = (new JsonParser()).parse(sResultJson).getAsJsonObject();
                                    //String sNewAotgId = objJson.get("Id").toString();
                                    //Log.info();("AOTG ID GENERATED : "+sNewAotgId);
                                    clStatus.setStatus(0);
                                    clStatus.setMsg("");
                                    clStatus.setError_msg(sResultJson);
                                    return clStatus;
                                }catch (Exception ex){
                                    ex.printStackTrace();
                                }
                            }
                        }
                        else{
                            Log.info("Empty RequestName or Id");
                            Log.info(aotg_response.getBody());
                        }
                    }
                }
                else{
                    Log.info("HTTP error while posting Account to AOTG.");
                    Log.info(aotg_response.toString());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return clStatus;
    }

    public CLCRMAccountDto getAccountInfo(String accessToken, String transId){
        CLCRMAccountDto clcrmAccountDto = new CLCRMAccountDto();
        Gson gson = new Gson();
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        String AOTG_URL = clUtils.getValueFromPropFile("aotg.url");
        String sUrl = CRM_URL+String.format(CLConstants.CRM_GET_ACCOUNT,transId);
        try {
            Map<String,String> crm_headers = new HashMap<String,String>();
            crm_headers.put("access_token",accessToken);
            crm_headers.put("content-type","application/json");
            HttpResponse<String> response = clUtils.sendGetRequest(sUrl,crm_headers);
            if(response.getStatus()==200){
                clcrmAccountDto = gson.fromJson(response.getBody(),CLCRMAccountDto.class);
                if(clcrmAccountDto.getStatus()==1 && (clcrmAccountDto.getErrors()==null)){
                    return clcrmAccountDto;
                }else {
                    Log.info("GET : Account Details : CRM Response : " + response.getBody());
                }
            }else{
                Log.info("GET: Account Details " +
                        "=== " +
                        "STATUS_CODE : " + response.getStatus() + ", " +
                        "STATUS_TEXT : " + response.getStatusText() + ", " +
                        "BODY : " + response.getBody());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return clcrmAccountDto;
    }

    public String getAotgIdFromAccountDetails(CLCRMAccountDto clcrmAccountDto){
        String sAOTGId="";
        if(clcrmAccountDto!=null){
            sAOTGId = clcrmAccountDto.getRecords().get(0).getiAutoCountId();
        }
        return sAOTGId;
    }

    public void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }

    public boolean updateAccountWithAOTGId(String trandId,String accessToken,String sAOTGId,String sNewAccNo){
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject objOfRecords = new JsonObject();
        objOfRecords.addProperty("iAutoCountId",sAOTGId);
        JsonArray arrOfRecords = new JsonArray();
        arrOfRecords.add(objOfRecords);
        JsonObject objRecords = new JsonObject();
        objRecords.addProperty("records",gson.toJson(arrOfRecords));
        //String  sJson = gson.toJson(objRecords);
        String sJson = "{ records:[{ iAutoCountId :"+sAOTGId+" , bRestrictWF : true , Code : "+sNewAccNo+" }] }";
        String sUrl = CRM_URL+String.format(CLConstants.CRM_UPDATE_ACCOUNT,trandId);
        Log.info("Updating Account with AOTG Id Json==="+sJson+", URl=="+sUrl);
        Map<String,String > crm_auth = new HashMap<String,String>();
        crm_auth.put("content-type","application/json");
        crm_auth.put("access_token",accessToken);
        //crm_auth.put("URIEncoding","UTF8");
        HttpResponse<String> response = clUtils.sendPostRequest(sUrl,crm_auth,sJson);
        Log.info("Http_Resp_For_AccUpdate==="+response.getBody());
        if(response.getStatus()==200){
            JsonObject crmObj= (new JsonParser()).parse(response.getBody()).getAsJsonObject();
            if(crmObj.get("status").toString().equals("1")){
                Log.info("Account Updated with AOTG ID Successfully...");
                return true;
            }else {
                if(crmObj.get("error").getAsJsonArray()!=null){
                    return false;
                }
            }
        }else{
            Log.info("HTTP error while updating the Account with AOTG id in CRM.");
            Log.info("HTTP_ERROR=="+response);
            return false;
        }
        return false;
    }

}
