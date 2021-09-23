package com.crm.aotg.integration.utils;


import java.io.IOException;

public class Log {

    public static String log_file_name = "CRM_API_AOTG_Integration_" + CLUtils.getCurrentDateAsString() + ".txt";
    public static String log_file_path = CLUtils.TEMP_PATH + "\\" + log_file_name;
    public static String API_NAME = "AOTG_Integration";
    public static final String ERROR_LOG = "[ERROR]-" + API_NAME;
    public static final String INFO_LOG = "[INFO ]-" + API_NAME;

    public static void error(String sData) {
        //sData = ERROR_LOG+" - ["+CLUtils.getCurrentDateTimeAsString()+"] - "+sData+"\n\n";
        sData = "[" + CLUtils.getCurrentDateTimeAsString() + "] - " + sData + "\n";
        System.out.print(sData);
        try {
            CLUtils.writeToFile(sData, log_file_path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void info(String sData) {
        //sData = INFO_LOG+" - ["+CLUtils.getCurrentDateTimeAsString()+"] - "+sData+"\n\n";
        sData = "[" + CLUtils.getCurrentDateTimeAsString() + "] - " + sData + "\n";
        System.out.print(sData);
        try {
            CLUtils.writeToFile(sData, log_file_path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getLog_file_name(){
        return log_file_path;
    }

}
