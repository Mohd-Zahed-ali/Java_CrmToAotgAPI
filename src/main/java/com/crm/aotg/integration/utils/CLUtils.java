package com.crm.aotg.integration.utils;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Component
public class CLUtils implements IUtils {

    @Autowired
    private Environment env;

    public static String TEMP_PATH = System.getenv("TEMP");

    @Override
    public HttpResponse<String> sendGetRequest(String sUrl,Map<String,String> headers){
        HttpResponse<String> response = null;
        Unirest.setTimeouts(0, 0);
        try {
            response = Unirest
                    .get(sUrl)
                    .headers(headers)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public HttpResponse<String> sendPostRequest(String sUrl, Map<String,String> headers,String sJson){
        HttpResponse<String> response = null;
        Unirest.setTimeouts(0, 0);
        try {
            response = Unirest
                    .post(sUrl)
                    .headers(headers)
                    .body(sJson)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public HttpResponse<String> sendPutRequest(String sUrl, Map<String, String> headers, String sJson) {
        HttpResponse<String> response = null;
        Unirest.setTimeouts(0, 0);
        try {
            response = Unirest
                    .put(sUrl)
                    .headers(headers)
                    .body(sJson)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public HttpResponse<String> sendDeleteRequest(String sUrl, Map<String, String> headers) {
        HttpResponse<String> response = null;
        Unirest.setTimeouts(0, 0);
        try {
            response = Unirest
                    .delete(sUrl)
                    .headers(headers)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    public String getValueFromPropFile(String sKey){
        return env.getProperty(sKey);
    }

    @Override
    public void log(String sDate){
    }

    public static String isFileExist(String sFilepath,Boolean bDoCreateIfNotExits) throws IOException
    {

        File fl = new File(sFilepath);
        if(fl.exists())
        {
            return sFilepath;
        }
        else
        {
            if(bDoCreateIfNotExits)
            {
                if(fl.createNewFile())
                {
                    return sFilepath;
                }
                else
                {
                    return null;
                }
            }

        }
        return null;
    }

    public static String getCurrentDateAsString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return sdf.format(date);
    }

    public static String getCurrentDateTimeAsString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        return sdf.format(date);
    }

    public static void writeToFile(String sData,String sFilePath) throws IOException
    {
        try {
            Files.write(Paths.get(sFilePath),sData.getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
