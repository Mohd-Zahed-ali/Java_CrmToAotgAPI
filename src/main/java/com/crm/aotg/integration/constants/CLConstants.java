package com.crm.aotg.integration.constants;

import org.springframework.stereotype.Component;

@Component
public class CLConstants {

    //AOTG
    //DEBTOR
    public static final String AOTG_GET_DEBTOR= "/api/public/v1/Debtor/%s";
    public static final String AOTG_CREATE_DEBTOR= "/api/public/v1/Debtor";
    public static final String AOTG_UPDATE_DEBTOR= "/api/public/v1/Debtor";
    public static final String AOTG_DELETE_DEBTOR= "/api/public/v1/Debtor/%s";

    //STOCK_ITEM
    public static final String AOTG_GET_STOCKITEM= "/api/public/v1/StockItem/%s";
    public static final String AOTG_CREATE_STOCKITEM= "/api/public/v1/StockItem/CreateStockItem";
    public static final String AOTG_UPDATE_STOCKITEM= "/api/public/v1/StockItem/UpdateStockItem";
    public static final String AOTG_DELETE_STOCKITEM= "/api/public/v1/StockItem/%s";

    //SALES_ORDER
    public static final String AOTG_GET_SALESORDER= "/api/public/v1/SalesOrder/%s";
    public static final String AOTG_CREATE_SALESORDER= "/api/public/v1/SalesOrder";
    public static final String AOTG_UPDATE_SALESORDER= "/api/public/v1/SalesOrder";
    public static final String AOTG_DELETE_SALESORDER= "/api/public/v1/SalesOrder/%s";

    //REQUEST_RESULT
    public static final String AOTG_CHECKSTATUS= "/api/public/v1/Result/%s";
    public static final String AOTG_RESULT= "/api/public/v1/Result/%s/%s/result";
    public static final String AOTG_STATUS_FAILED= "Failed";
    public static final String AOTG_STATUS_POCESSING= "Processing";
    public static final String AOTG_STATUS_INQUEUE= "InQueue";
    public static final String AOTG_STATUS_COMPLETED= "Completed";

    //AOTH_AUTH
    public static final String AOTH_AUTH = "/api/public/v1/TokenAuth/Authenticate";

    //ROW_STATES
    public static final Integer AOTH_ROWSTATE_UNCHANGED = 0;
    public static final Integer AOTH_ROWSTATE_ADDED = 1;
    public static final Integer AOTH_ROWSTATE_MODIFIED = 2;
    public static final Integer AOTH_ROWSTATE_DELETED = 4;

    //CRM_SERVICES
    //ACCOUNT
    public static final String CRM_GET_ACCOUNT = "/crmservices/rest/modules/V1.0/Account/%s";
    public static final String CRM_UPDATE_ACCOUNT = "/crmservices/rest/modules/V1.0/Account/%s";

    //PRODUCT
    public static final String CRM_GET_PRODUCT = "/crmservices/rest/modules/V1.0/Product/%s";
    public static final String CRM_UPDATE_PRODUCT = "/crmservices/rest/modules/V1.0/Product/%s";

    //SALESORDER
    public static final String CRM_GET_SALESORDER = "/crmservices/rest/modules/V1.0/Salesorder/%s";
    public static final String CRM_UPDATE_SALESORDER = "/crmservices/rest/modules/V1.0/Salesorder/%s";

}
