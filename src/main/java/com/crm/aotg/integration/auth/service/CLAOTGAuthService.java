package com.crm.aotg.integration.auth.service;

import com.crm.aotg.integration.auth.dto.CLAuthRequestDto;
import com.crm.aotg.integration.auth.dto.CLAuthResponseDto;
import com.crm.aotg.integration.constants.CLConstants;
import com.crm.aotg.integration.utils.CLUtils;
import com.crm.aotg.integration.utils.Log;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CLAOTGAuthService {

    @Autowired
    private CLUtils clUtils;

    public String getNewAccessToken() {
        String sAccessToken = "";
        String sAOTGAuthUrl = clUtils.getValueFromPropFile("aotg.url") + CLConstants.AOTH_AUTH;
        Log.info("AOTG Url==="+sAOTGAuthUrl);
        Gson gson = new Gson();

        Map<String, String> auth_headers = new HashMap<String, String>();
        auth_headers.put("content-type", "application/json");

        CLAuthRequestDto clAuthRequestDto = new CLAuthRequestDto();
        clAuthRequestDto.setUserName(clUtils.getValueFromPropFile("aotg.username"));
        clAuthRequestDto.setPassword(clUtils.getValueFromPropFile("aotg.password"));
        clAuthRequestDto.setApiKey(clUtils.getValueFromPropFile("aotg.apikey"));

        Log.info("AOTG Details :\n"+clAuthRequestDto.getUserName());
        Log.info(clAuthRequestDto.getPassword());
        Log.info(clAuthRequestDto.getApiKey());

        String sFinalJson = gson.toJson(clAuthRequestDto);
        Log.info("Final JSON for AUTH : "+sFinalJson);
        HttpResponse<String> response = clUtils.sendPostRequest(sAOTGAuthUrl, auth_headers, sFinalJson);

        if (response.getStatus() == 200) {
            Log.info("AOTG_AUTH_RESP_STATUS_CODE  :" + response.getStatus());
            Log.info("AOTG_AUTH_RESP_STATUS_TEXT  :" + response.getStatusText());
            CLAuthResponseDto clAuthResponseDto = gson.fromJson(response.getBody(), CLAuthResponseDto.class);
            sAccessToken = clAuthResponseDto.getAccessToken();
            Log.info("AOTG_AUTH_ACCESSTOKEN       :" + sAccessToken);
        } else {
            Log.info("AOTG_AUTH_RESP_STATUS_CODE  :" + response.getStatus());
            Log.info("AOTG_AUTH_RESP_STATUS_TEXT  :" + response.getStatusText());
            Log.info("AOTG_AUTH_RESP_BODY         :" + response.getBody());
        }
        return sAccessToken;
    }
}
