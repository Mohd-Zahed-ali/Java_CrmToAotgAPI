package com.crm.aotg.integration.product.service;

import com.crm.aotg.integration.auth.service.CLAOTGAuthService;
import com.crm.aotg.integration.common.dto.*;
import com.crm.aotg.integration.constants.CLConstants;
import com.crm.aotg.integration.product.dto.CLCRMProductDto;
import com.crm.aotg.integration.product.dto.CLProductDto;
import com.crm.aotg.integration.product.dto.Record;
import com.crm.aotg.integration.product.dto.Uom;
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
public class CLProductService {

    @Autowired
    private CLAOTGAuthService claotgAuthService;

    @Autowired
    private CLUtils clUtils;

    @Autowired
    private CLAOTGCommon claotgCommon;

    public CLBaseStatusDto createOrUpdateProduct(String accessToken, String transId, String ccode, String userId) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        CLBaseStatusDto clStatus = new CLBaseStatusDto();
        clStatus.setStatus(0);
        clStatus.setMsg("");
        clStatus.setError_msg("Error in AOTG Posting.");

        Log.info("In CreateOrUpdate Product.");
        Log.info("Getting Product Deatails for " + transId);
        CLCRMProductDto clcrmProductDto = getProductInfo(accessToken, transId);
        Log.info("Got Product Deatails : " + gson.toJson(clcrmProductDto));
        String aotg_accessToken = "";
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        Log.info("CRM_URL : " + CRM_URL);
        String AOTG_URL = clUtils.getValueFromPropFile("aotg.url");
        Log.info("AOTG_URL : " + AOTG_URL);
        Long AOTG_THREAD_SLEEP = Long.parseLong(clUtils.getValueFromPropFile("aotg.thread.sleep"));
        Log.info("AOTG_THREAD_SLEEP : " + AOTG_THREAD_SLEEP);
        try {
            if (clcrmProductDto != null) {
                Log.info("Getting AOTG_ID from Product....");
                String sAOTGId = getAotgIdFromProductDetails(clcrmProductDto);
                Log.info("Got AOTG_ID =" + sAOTGId);
                Log.info("Getting AOTG AccessToken...");
                aotg_accessToken = claotgAuthService.getNewAccessToken();

                if(aotg_accessToken.equals("")){
                    clStatus.setStatus(0);
                    clStatus.setMsg("");
                    clStatus.setError_msg("Empty AOTG Token");
                    return clStatus;
                }

                Log.info("Got AOTG AccessToken :" + aotg_accessToken);
                String sURL = "";

                Log.info("Forming JSON for AOTG Posting...");
                CLProductDto clProductDto = new CLProductDto();
                Uom uom = new Uom();
                List<Uom> lstUom = new ArrayList<Uom>();
                Record prod_records = clcrmProductDto.getRecords().get(0);

                //if(!sAOTGId.equals("")){ clProductDto.setId(sAOTGId);}
                clProductDto.setItemCode(prod_records.getCode());
                clProductDto.setIsActive(true);
                clProductDto.setItemCode(prod_records.getCode());
                clProductDto.setItemDescription(prod_records.getDescription());
                clProductDto.setBaseUOM(prod_records.getUoMName());
                clProductDto.setSalesUOM(prod_records.getUoMName());
                clProductDto.setPurchaseUOM(prod_records.getUoMName());
                clProductDto.setReportUOM(prod_records.getUoMName());

                uom.setUom(prod_records.getUoMName());
                uom.setRate(1.00d);
                uom.setShelf("");
                uom.setWeight(0.00d);
                uom.setWeightUOM("");
                uom.setVolume(0.00d);
                uom.setVolumeUOM("");
                uom.setReOrderLevel(0);
                uom.setNormalLevel(0);
                uom.setPrice(toDob(prod_records.getBaseCeilingPrice()));
                uom.setMinQty(toDob(prod_records.getiMinQty()));
                uom.setMaxQty(toDob(prod_records.getiMaxQty()));
                uom.setMaxSellingPrice(toDob(prod_records.getfMaxSellingPrice()));
                uom.setMinSellingPrice(toDob(prod_records.getfMinSellingPrice()));
                uom.setMaxPurchasePrice(toDob(prod_records.getfMaxPurchasePrice()));
                uom.setMinPurchasePrice(toDob(prod_records.getfMinPurchasePrice()));
                if (!sAOTGId.equals("")) {
                    clProductDto.setId(sAOTGId);
                    uom.setRowState(CLConstants.AOTH_ROWSTATE_MODIFIED);
                } else {
                    uom.setRowState(CLConstants.AOTH_ROWSTATE_ADDED);
                }
                lstUom.add(uom);
                clProductDto.setUom(lstUom);
                clProductDto.setBaseUOM(prod_records.getUoMName());
                clProductDto.setDiscontinued(false);
                clProductDto.setDutyRate(0);
                clProductDto.setSupplyTaxCode("");
                clProductDto.setPurchaseTaxCode("");
                clProductDto.setIsStockControl(true);
                clProductDto.setIsBackOrderControl(true);
                clProductDto.setIsAutoUOMConversion(true);
                clProductDto.setTariffCode(null);
                clProductDto.setCostingMethod(1);
                clProductDto.setPurchaseTaxRate(0);
                clProductDto.setSupplyTaxRate(0);
                String sJSON = gson.toJson(clProductDto);
                Log.info("Formed JSON for AOTG Posting : " + sJSON);
                HttpResponse<String> aotg_response = null;
                Map<String, String> aotg_headers = new HashMap<String, String>();
                aotg_headers.put("content-type", "application/json");
                aotg_headers.put("SOTC_AUTH", aotg_accessToken);

                if (!sAOTGId.equals("")) {
                    sURL = AOTG_URL + String.format(CLConstants.AOTG_UPDATE_STOCKITEM);
                    Log.info("Updating AOTG Product for ID=" + sAOTGId);
                    Log.info("Updating AOTG Product URL=" + sURL);
                    aotg_response = clUtils.sendPutRequest(sURL, aotg_headers, sJSON);
                } else {
                    sURL = AOTG_URL + String.format(CLConstants.AOTG_CREATE_STOCKITEM);
                    //Log.info("Creating AOTG Product for ID="+sAOTGId);
                    Log.info("Creating AOTG Product URL=" + sURL);
                    aotg_response = clUtils.sendPostRequest(sURL, aotg_headers, sJSON);
                }

                Log.info("AOTG Product HTTPResponse===" + aotg_response.getStatus() + "," + aotg_response.getStatusText() + "," + aotg_response.getBody());
                if (aotg_response.getStatus() == 200) {
                    Log.info("Product HTTP Request Success..");
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
                            String sURL_REQ_RESULT = AOTG_URL + String.format(CLConstants.AOTG_RESULT, sRequestName, sCurrentReqId);
                            if (sCurrentStatus.equals(CLConstants.AOTG_STATUS_COMPLETED)) {
                                try {
                                    CLAOTGResultDto claotgResultDto = new CLAOTGResultDto();
                                    Log.info("AOTG_Result Request on URL ==" + sURL_REQ_RESULT);
                                    claotgResultDto = claotgCommon.getRequestResult(sURL_REQ_RESULT, aotg_headers);
                                    //String sResultJson = claotgResultDto.getResultJson().replaceAll("\"","");
                                    String sResultJson = claotgResultDto.getResultJson();
                                    Log.info("ResultJSON_COMPLETED=====>" + sResultJson);
                                    JsonObject objJson = (new JsonParser()).parse(sResultJson).getAsJsonObject();
                                    String sNewAotgId = objJson.get("Id").toString();
                                    String sItemName = objJson.get("ItemCode").toString();
                                    Log.info("AOTG ID GENERATED : " + sNewAotgId);

                                    if (!sAOTGId.equals("")) {
                                        clStatus.setStatus(1);
                                        clStatus.setMsg("AOTG Record Updated.");
                                        clStatus.setError_msg("");
                                        return clStatus;
                                    }

                                    if (!sNewAotgId.equals("")) {
                                        boolean bIsAccUpdated = updateProductWithAOTGId(transId, accessToken, sNewAotgId,sItemName);

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
                                    Log.info("AOTG_Result Request on URL ==" + sURL_REQ_RESULT);
                                    claotgResultDto = claotgCommon.getRequestResult(sURL_REQ_RESULT, aotg_headers);
                                    //String sResultJson = claotgResultDto.getResultJson().replaceAll("\"","");
                                    String sResultJson = claotgResultDto.getResultJson();
                                    Log.info("ResultJSON_FAILED=====>" + sResultJson);
                                    Log.info("AOTG_Product_POSTING_FAILED_JSON: " + sResultJson);
                                    //JsonObject objJson = (new JsonParser()).parse(sResultJson).getAsJsonObject();
                                    //String sNewAotgId = objJson.get("Id").toString();
                                    //Log.info();("AOTG ID GENERATED : "+sNewAotgId);
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
                    Log.info("HTTP error while posting Product to AOTG.");
                    Log.info(aotg_response.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clStatus;
    }

    public CLCRMProductDto getProductInfo(String accessToken, String transId) {
        CLCRMProductDto clcrmProductDto = new CLCRMProductDto();
        Gson gson = new Gson();
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        String AOTG_URL = clUtils.getValueFromPropFile("aotg.url");
        String sUrl = CRM_URL + String.format(CLConstants.CRM_GET_PRODUCT, transId);
        try {
            Map<String, String> crm_headers = new HashMap<String, String>();
            crm_headers.put("access_token", accessToken);
            crm_headers.put("content-type", "application/json");
            HttpResponse<String> response = clUtils.sendGetRequest(sUrl, crm_headers);
            if (response.getStatus() == 200) {
                clcrmProductDto = gson.fromJson(response.getBody(), CLCRMProductDto.class);
                if (clcrmProductDto.getStatus() == 1 && (clcrmProductDto.getErrors() == null)) {
                    return clcrmProductDto;
                } else {
                    Log.info("GET : Product Details : CRM Response : " + response.getBody());
                }
            } else {
                Log.info("GET: Product Details " +
                        "=== " +
                        "STATUS_CODE : " + response.getStatus() + ", " +
                        "STATUS_TEXT : " + response.getStatusText() + ", " +
                        "BODY : " + response.getBody());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return clcrmProductDto;
    }

    public String getAotgIdFromProductDetails(CLCRMProductDto clcrmProductDto) {
        String sAOTGId = "";
        if (clcrmProductDto != null) {
            sAOTGId = clcrmProductDto.getRecords().get(0).getAutoCoundId();
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

    public boolean updateProductWithAOTGId(String trandId, String accessToken, String sAOTGId,String sItemName ) {
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject objOfRecords = new JsonObject();
        objOfRecords.addProperty("iAutoCountId", sAOTGId);
        JsonArray arrOfRecords = new JsonArray();
        arrOfRecords.add(objOfRecords);
        JsonObject objRecords = new JsonObject();
        objRecords.addProperty("records", gson.toJson(arrOfRecords));
        //String  sJson = gson.toJson(objRecords);
        String sJson = "{ records:[{ AutoCoundId :" + sAOTGId + " , Code : "+sItemName+", bRestrictWF : true }] }";
        String sUrl = CRM_URL + String.format(CLConstants.CRM_UPDATE_PRODUCT, trandId);
        Log.info("Updating Product with AOTG Id Json===" + sJson + ", URl==" + sUrl);
        Map<String, String> crm_auth = new HashMap<String, String>();
        crm_auth.put("content-type", "application/json");
        crm_auth.put("access_token", accessToken);
        //crm_auth.put("URIEncoding","UTF8");
        HttpResponse<String> response = clUtils.sendPostRequest(sUrl, crm_auth, sJson);
        Log.info("Http_Resp_For_AccUpdate===" + response.getBody());
        if (response.getStatus() == 200) {
            JsonObject crmObj = (new JsonParser()).parse(response.getBody()).getAsJsonObject();
            if (crmObj.get("status").toString().equals("1")) {
                Log.info("Product Updated with AOTG ID Successfully...");
                return true;
            } else {
                if (crmObj.get("error").getAsJsonArray() != null) {
                    return false;
                }
            }
        } else {
            Log.info("HTTP error while updating the Product with AOTG id in CRM.");
            Log.info("HTTP_ERROR==" + response);
            return false;
        }
        return false;
    }

    public Integer toInt(String sData) {
        if (!sData.equals("")) {
            Double dbl_val = 0.00d;
            Integer int_val = 0;

            dbl_val = Double.parseDouble(sData);
            int_val = (int) Math.round(dbl_val);

            return int_val;
        }
        return 0;
    }

    public Double toDob(String sData) {
        if (!sData.equals("")) {
            Double dbl_val = 0.00d;
            Integer int_val = 0;

            dbl_val = Double.parseDouble(sData);
            //int_val = (int)Math.round(dbl_val);

            return dbl_val;
        }
        return 0.00d;
    }


}
