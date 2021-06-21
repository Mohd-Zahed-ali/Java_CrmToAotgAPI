package com.crm.aotg.integration.common.dto;

import com.crm.aotg.integration.utils.CLUtils;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CLAOTGCommon {

    @Autowired
    private CLUtils clUtils;

    public CLAOTGRequestStatusDto getRequestStatus(String sURL, Map<String,String > aoth_headers){
        Gson gson = new Gson();
        CLAOTGRequestStatusDto claotgRequestStatusDto = new CLAOTGRequestStatusDto();
        String sResp = "";
        HttpResponse<String> response = clUtils.sendGetRequest(sURL,aoth_headers);
        if(response.getStatus()==200){
            claotgRequestStatusDto = gson.fromJson(response.getBody(),CLAOTGRequestStatusDto.class);
        }
        return claotgRequestStatusDto;
    }

    public CLAOTGResultDto getRequestResult(String sURL, Map<String,String > aoth_headers){
        Gson gson = new Gson();
        CLAOTGResultDto claotgResultDto = new CLAOTGResultDto();
        String sResp = "";
        HttpResponse<String> response = clUtils.sendGetRequest(sURL,aoth_headers);
        if(response.getStatus()==200){
            claotgResultDto = gson.fromJson(response.getBody(),CLAOTGResultDto.class);
        }
        return claotgResultDto;
    }

}
