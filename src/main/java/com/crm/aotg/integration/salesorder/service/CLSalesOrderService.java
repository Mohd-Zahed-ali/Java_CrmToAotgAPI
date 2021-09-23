package com.crm.aotg.integration.salesorder.service;

import com.crm.aotg.integration.salesorder.dto.*;
import com.crm.aotg.integration.auth.service.CLAOTGAuthService;
import com.crm.aotg.integration.common.dto.*;
import com.crm.aotg.integration.constants.CLConstants;
import com.crm.aotg.integration.utils.CLUtils;
import com.crm.aotg.integration.utils.Log;
import com.google.gson.*;
import com.mashape.unirest.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CLSalesOrderService {

    @Autowired
    private CLAOTGAuthService claotgAuthService;

    @Autowired
    private CLUtils clUtils;

    @Autowired
    private CLAOTGCommon claotgCommon;

    public CLBaseStatusDto createOrUpdateSalesOrder(String accessToken, String transId, String ccode, String userId) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        CLBaseStatusDto clStatus = new CLBaseStatusDto();
        clStatus.setStatus(0);
        clStatus.setMsg("");
        clStatus.setError_msg("Error in AOTG Posting.");

        Log.info("In CreateOrUpdate SalesOrder.");
        Log.info("Getting SalesOrder Deatails for " + transId);
        CLCRMSalesorderDto clcrmSalesOrderDto = getSalesOrderInfo(accessToken, transId);
        Log.info("Got SalesOrder Deatails : " + gson.toJson(clcrmSalesOrderDto));
        String aotg_accessToken = "";
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        Log.info("CRM_URL : " + CRM_URL);
        String AOTG_URL = clUtils.getValueFromPropFile("aotg.url");
        Log.info("AOTG_URL : " + AOTG_URL);
        Long AOTG_THREAD_SLEEP = Long.parseLong(clUtils.getValueFromPropFile("aotg.thread.sleep"));
        Log.info("AOTG_THREAD_SLEEP : " + AOTG_THREAD_SLEEP);
        try {
            if (clcrmSalesOrderDto != null) {
                Log.info("Getting AOTG_ID from SalesOrder....");
                String sAOTGId = getAotgIdFromSalesOrderDetails(clcrmSalesOrderDto);
                Log.info("Got AOTG_ID =" + sAOTGId);
                Log.info("Getting AOTG AccessToken...");
                aotg_accessToken = claotgAuthService.getNewAccessToken();
                Log.info("Got AOTG AccessToken :" + aotg_accessToken);
                String sURL = "";

                Log.info("Forming JSON for AOTG Posting...");
                CLSalesOrderDto clSalesOrderDto = new CLSalesOrderDto();
                InvoiceAddress invoiceAddress = new InvoiceAddress();
                DeliverAddress deliverAddress = new DeliverAddress();
                clSalesOrderDto.setInvoiceAddress(invoiceAddress);
                clSalesOrderDto.setDeliverAddress(deliverAddress);
                Record so_records = clcrmSalesOrderDto.getRecords().get(0);

                if (!sAOTGId.equals("")) {
                    clSalesOrderDto.setId(sAOTGId);
                }
                clSalesOrderDto.setDebtor(so_records.getAccountCode());
                clSalesOrderDto.setDebtorName(so_records.getAccountName());
                //DeliverAddress del_add = new DeliverAddress();
                //InvoiceAddress inv_add = new InvoiceAddress();
                clSalesOrderDto.setAgent("");
                clSalesOrderDto.setSalesLocation("HQ");
                clSalesOrderDto.setDocumentDate(getAOTGFormattedDate(so_records.getDate()));
                clSalesOrderDto.setCreditTerm("Payment In Advance");
                clSalesOrderDto.setInclusiveTax(false);
                clSalesOrderDto.setDescription(so_records.getDescription());
                clSalesOrderDto.setRef("");
                clSalesOrderDto.setRefDocNo(so_records.getName());
                clSalesOrderDto.setNote("");
                List<DetailsLine> lst_detailsLine = new ArrayList<>();

                List<LineItem> objLine = so_records.getLineItems();
                //Integer linitems_count = objLine.size();

                for (LineItem currentItme : objLine) {

                    DetailsLine objItems = new DetailsLine();
                    if (!currentItme.getIAOTGBodyId().equals("")) {
                        objItems.setId(currentItme.getIAOTGBodyId());
                        objItems.setRowState(2);
                    } else {
                        objItems.setRowState(1);
                    }
                    objItems.setItem(currentItme.getProductCode());
                    objItems.setUom(currentItme.getUoMCode());
                    objItems.setIsGoodsReturn(false);
                    objItems.setQty(Double.parseDouble(currentItme.getQuantity()));
                    if (currentItme.getDiscount().equals("")) {
                        objItems.setDiscountAmount(0.00d);
                    } else {
                        objItems.setDiscountAmount(Double.parseDouble(currentItme.getDiscount()));
                    }
                    objItems.setUnitPrice(Double.parseDouble(currentItme.getSalesPrice().equals("") ? "0.00" : currentItme.getSalesPrice()));
                    objItems.setDescription(currentItme.getProductIdName());
                    objItems.setLocation("HQ");
                    objItems.setDeliveryDate(getAOTGFormattedDate(so_records.getDate()));
                    objItems.setSalesTaxExemptionNo("");

                    lst_detailsLine.add(objItems);
                }

                clSalesOrderDto.setDetailsLine(lst_detailsLine);
                clSalesOrderDto.setIsRoundAdj(false);
                clSalesOrderDto.setRoundingMethod(4);
                clSalesOrderDto.setRoundAdj(0.00d);
                clSalesOrderDto.setIsCancelled(false);
                clSalesOrderDto.setToDocKey("");
                clSalesOrderDto.setToDocType("");
                clSalesOrderDto.setIsTransferred(false);
                TransferFromQuotationDocument trnsfObj = new TransferFromQuotationDocument();
                clSalesOrderDto.setTransferFromQuotationDocument(trnsfObj);
                clSalesOrderDto.setCurrencyCode("MYR");
                clSalesOrderDto.setCurrencySymbol("RM");
                clSalesOrderDto.setCurrencyRate(1.00d);
                clSalesOrderDto.setBranch("");
                clSalesOrderDto.setSalesTaxExemptionNo("");
                clSalesOrderDto.setTransferable(true);
                clSalesOrderDto.setEnableBranch(false);
                clSalesOrderDto.setValidateBackOrder(false);
                clSalesOrderDto.setValidateMinMaxPrice(false);

                String sJSON = gson.toJson(clSalesOrderDto);
                Log.info("Formed JSON for AOTG Posting : " + sJSON);
                HttpResponse<String> aotg_response = null;
                Map<String, String> aotg_headers = new HashMap<>();
                aotg_headers.put("content-type", "application/json");
                aotg_headers.put("SOTC_AUTH", aotg_accessToken);

                if (!sAOTGId.equals("")) {
                    sURL = AOTG_URL + String.format(CLConstants.AOTG_UPDATE_SALESORDER);
                    Log.info("Updating AOTG SalesOrder for ID=" + sAOTGId);
                    Log.info("Updating AOTG SalesOrder URL=" + sURL);
                    aotg_response = clUtils.sendPutRequest(sURL, aotg_headers, sJSON);
                } else {
                    sURL = AOTG_URL + String.format(CLConstants.AOTG_CREATE_SALESORDER);
                    //Log.info("Creating AOTG SalesOrder for ID="+sAOTGId);
                    Log.info("Creating AOTG SalesOrder URL=" + sURL);
                    aotg_response = clUtils.sendPostRequest(sURL, aotg_headers, sJSON);
                }

                Log.info("AOTG SalesOrder HTTPResponse===" + aotg_response.getStatus() + "," + aotg_response.getStatusText() + "," + aotg_response.getBody());
                if (aotg_response.getStatus() == 200) {
                    Log.info("SalesOrder HTTP Request Success..");
                    CLAOTGInitialRequestDto claotgInitialRequestDto = new CLAOTGInitialRequestDto();
                    claotgInitialRequestDto = gson.fromJson(aotg_response.getBody(), CLAOTGInitialRequestDto.class);
                    if (claotgInitialRequestDto != null) {
                        String sRequestName = claotgInitialRequestDto.getName();
                        String sId = claotgInitialRequestDto.getId();
                        if (!sRequestName.equals("") && !sId.equals("")) {
                            Log.info("AOTG Checking Request Status..");
                            String sCurrentStatus = "";
                            String sCurrentReqId = "";
                            Log.info("AOTG Checking Request Status Initila Variables CurrecntReqStatua and CurrentReqId are blank..");
                            String sURL_REQ_STATUS = AOTG_URL + String.format(CLConstants.AOTG_CHECKSTATUS, sId);
                            do {
                                Thread.sleep(AOTG_THREAD_SLEEP);
                                CLAOTGRequestStatusDto claotgRequestStatusDto = claotgCommon.getRequestStatus(sURL_REQ_STATUS, aotg_headers);
                                if (claotgRequestStatusDto != null) {
                                    sCurrentStatus = claotgRequestStatusDto.getStatus();
                                    sCurrentReqId = claotgRequestStatusDto.getRequestId();
                                }
                            } while (sCurrentStatus.equals(CLConstants.AOTG_STATUS_INQUEUE) || sCurrentStatus.equals(CLConstants.AOTG_STATUS_POCESSING));
                            Log.info(String.format("AOTG Current Status == {ReqStatus:%s,ReqId:%s}", sCurrentStatus, sCurrentReqId));
                            if (sCurrentStatus.equals(CLConstants.AOTG_STATUS_COMPLETED)) {
                                try {
                                    CLAOTGResultDto claotgResultDto = new CLAOTGResultDto();
                                    String sURL_REQ_RESULT = AOTG_URL + String.format(CLConstants.AOTG_RESULT, sRequestName, sCurrentReqId);
                                    Log.info("AOTG_Result Request on URL ==" + sURL_REQ_RESULT);
                                    claotgResultDto = claotgCommon.getRequestResult(sURL_REQ_RESULT, aotg_headers);
                                    //String sResultJson = claotgResultDto.getResultJson().replaceAll("\"","");
                                    String sResultJson = claotgResultDto.getResultJson();
                                    Log.info("ResultJSON_COMPLETED=====>" + sResultJson);
                                    JsonObject objJson = (new JsonParser()).parse(sResultJson).getAsJsonObject();
                                    String sNewAotgId = objJson.get("Id").toString();
                                    Log.info("AOTG ID GENERATED : " + sNewAotgId);

                                    CLSalesOrderDto clSalesOrderDto1 = gson.fromJson(sResultJson, CLSalesOrderDto.class);

                                    if (!sAOTGId.equals("")) {
                                        boolean bIsAccUpdated = updateSalesOrderWithAOTGId(transId, accessToken, sNewAotgId, clSalesOrderDto1, clcrmSalesOrderDto);

                                        clStatus.setStatus(bIsAccUpdated ? 1 : 0);
                                        clStatus.setMsg(bIsAccUpdated ? "AOTG Record Updated." : "");
                                        clStatus.setError_msg(bIsAccUpdated ? "" : "Error while creating Aotg Records.");
                                        return clStatus;
                                    }

                                    if (!sNewAotgId.equals("")) {
                                        boolean bIsAccUpdated = updateSalesOrderWithAOTGId(transId, accessToken, sNewAotgId, clSalesOrderDto1, clcrmSalesOrderDto);

                                        clStatus.setStatus(bIsAccUpdated ? 1 : 0);
                                        clStatus.setMsg(bIsAccUpdated ? "AOTG Record Created." : "");
                                        clStatus.setError_msg(bIsAccUpdated ? "" : "Error while creating Aotg Records.");
                                        return clStatus;
                                    }
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }

                            } else if (sCurrentStatus.equals(CLConstants.AOTG_STATUS_FAILED)) {
                                try {
                                    CLAOTGResultDto claotgResultDto = new CLAOTGResultDto();
                                    String sURL_REQ_RESULT = AOTG_URL + String.format(CLConstants.AOTG_RESULT, sRequestName, sCurrentReqId);
                                    Log.info("AOTG_Result Request on URL ==" + sURL_REQ_RESULT);
                                    claotgResultDto = claotgCommon.getRequestResult(sURL_REQ_RESULT, aotg_headers);
                                    //String sResultJson = claotgResultDto.getResultJson().replaceAll("\"","");
                                    String sResultJson = claotgResultDto.getResultJson();
                                    Log.info("ResultJSON_FAILED=====>" + sResultJson);
                                    Log.info("AOTG_SalesOrder_POSTING_FAILED_JSON: " + sResultJson);
                                    clStatus.setStatus(0);
                                    clStatus.setMsg("");
                                    clStatus.setError_msg(sResultJson);
                                    return clStatus;
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            }
                        } else {
                            Log.info("Empty RequestName or Id");
                            Log.info(aotg_response.getBody());
                        }
                    }
                } else {
                    Log.info("HTTP error while posting SalesOrder to AOTG.");
                    Log.info(aotg_response.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clStatus;
    }

    public CLCRMSalesorderDto getSalesOrderInfo(String accessToken, String transId) {
        CLCRMSalesorderDto clcrmSalesOrderDto = new CLCRMSalesorderDto();
        Gson gson = new Gson();
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        String AOTG_URL = clUtils.getValueFromPropFile("aotg.url");
        String sUrl = CRM_URL + String.format(CLConstants.CRM_GET_SALESORDER, transId);
        try {
            Map<String, String> crm_headers = new HashMap<>();
            crm_headers.put("access_token", accessToken);
            crm_headers.put("content-type", "application/json");
            HttpResponse<String> response = clUtils.sendGetRequest(sUrl, crm_headers);
            if (response.getStatus() == 200) {
                clcrmSalesOrderDto = gson.fromJson(response.getBody(), CLCRMSalesorderDto.class);
                if (clcrmSalesOrderDto.getStatus() == 1 && (clcrmSalesOrderDto.getErrors() == null)) {
                    return clcrmSalesOrderDto;
                } else {
                    Log.info("GET : SalesOrder Details : CRM Response : " + response.getBody());
                }
            } else {
                Log.info("GET: SalesOrder Details " +
                        "=== " +
                        "STATUS_CODE : " + response.getStatus() + ", " +
                        "STATUS_TEXT : " + response.getStatusText() + ", " +
                        "BODY : " + response.getBody());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return clcrmSalesOrderDto;
    }

    public String getAotgIdFromSalesOrderDetails(CLCRMSalesorderDto clcrmSalesOrderDto) {
        String sAOTGId = "";
        if (clcrmSalesOrderDto != null) {
            sAOTGId = clcrmSalesOrderDto.getRecords().get(0).getiAutoCountId();
        }
        return sAOTGId;
    }

    public void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    }

    public boolean updateSalesOrderWithAOTGId(String trandId, String accessToken, String sAOTGId, CLSalesOrderDto objAOTGSo, CLCRMSalesorderDto objCRMSo) {
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject objOfRecords = new JsonObject();
        objOfRecords.addProperty("iAutoCountId", sAOTGId);
        JsonArray arrOfRecords = new JsonArray();
        arrOfRecords.add(objOfRecords);
        JsonObject objRecords = new JsonObject();
        objRecords.addProperty("records", gson.toJson(arrOfRecords));
        //String  sJson = gson.toJson(objRecords);

        List<DetailsLine> lstAOTGItems = objAOTGSo.getDetailsLine();
        Integer iAOTGLineItemsCount = lstAOTGItems.size();
        StringBuilder sLineItems = new StringBuilder();
        for (int iIndex = 0; iIndex < iAOTGLineItemsCount; iIndex++) {

            if (iIndex == 0) {
                sLineItems.append("{ BodyId : \"").append(objCRMSo.getRecords().get(0).getLineItems().get(iIndex).getBodyId()).append("\", iAOTGBodyId : \"").append(lstAOTGItems.get(iIndex).getId()).append("\" }");
            } else {
                sLineItems.append(", { BodyId : \"").append(objCRMSo.getRecords().get(0).getLineItems().get(iIndex).getBodyId()).append("\", iAOTGBodyId : \"").append(lstAOTGItems.get(iIndex).getId()).append("\" }");
            }
        }

        String sJson = "{ records:[{ iAutoCountId :" + sAOTGId + " , bRestrictWF : true , AOTGSOID : "+objAOTGSo.getNumber().toString()+" , lineItems : [" + sLineItems + "] }] }";
        String sUrl = CRM_URL + String.format(CLConstants.CRM_UPDATE_SALESORDER, trandId) + "?isRetainExistingRows=true";
        Log.info("Updating SalesOrder with AOTG Id Json===" + sJson + ", URl==" + sUrl);
        Map<String, String> crm_auth = new HashMap<>();
        crm_auth.put("content-type", "application/json");
        crm_auth.put("access_token", accessToken);
        //crm_auth.put("URIEncoding","UTF8");
        HttpResponse<String> response = clUtils.sendPostRequest(sUrl, crm_auth, sJson);
        Log.info("Http_Resp_For_AccUpdate===" + response.getBody());
        if (response.getStatus() == 200) {
            JsonObject crmObj = (new JsonParser()).parse(response.getBody()).getAsJsonObject();
            if (crmObj.get("status").toString().equals("1")) {
                Log.info("SalesOrder Updated with AOTG ID Successfully...");
                return true;
            } else {
                if (crmObj.get("error").getAsJsonArray() != null) {
                    return false;
                }
            }
        } else {
            Log.info("HTTP error while updating the SalesOrder with AOTG id in CRM.");
            Log.info("HTTP_ERROR==" + response);
            return false;
        }
        return false;
    }

    public String getAOTGFormattedDate(String sDate) {
        if (sDate.equals(""))
            return "";
        String[] arrDateParts = sDate.split("/");
        String sDay = arrDateParts[0];
        String sMonth = arrDateParts[1];
        String sYear = arrDateParts[2];

        return sYear + "-" + sMonth + "-" + sDay + "T00:00:00";
    }
}
