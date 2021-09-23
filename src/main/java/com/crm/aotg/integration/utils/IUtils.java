package com.crm.aotg.integration.utils;

import com.mashape.unirest.http.HttpResponse;

import java.util.Map;

public interface IUtils {
    public HttpResponse<String> sendGetRequest(String sUrl, Map<String, String> headers);

    public HttpResponse<String> sendPostRequest(String sUrl, Map<String, String> headers, String sJson);

    public HttpResponse<String> sendPutRequest(String sUrl, Map<String, String> headers, String sJson);

    public HttpResponse<String> sendDeleteRequest(String sUrl, Map<String, String> headers);

    public void log(String sData);
}
