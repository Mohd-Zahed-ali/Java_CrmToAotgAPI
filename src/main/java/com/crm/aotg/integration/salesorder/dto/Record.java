package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Record implements Serializable
{

    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("TransId")
    @Expose
    private String transId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ExpiryDate")
    @Expose
    private String expiryDate;
    @SerializedName("OpportunityId__name")
    @Expose
    private String opportunityIdName;
    @SerializedName("OpportunityId__id")
    @Expose
    private String opportunityIdId;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("SyncType")
    @Expose
    private String syncType;
    @SerializedName("CreatedBy__name")
    @Expose
    private String createdByName;
    @SerializedName("CreatedBy__id")
    @Expose
    private String createdById;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("ModifiedBy__name")
    @Expose
    private String modifiedByName;
    @SerializedName("ModifiedBy__id")
    @Expose
    private String modifiedById;
    @SerializedName("ModifiedDate")
    @Expose
    private String modifiedDate;
    @SerializedName("SubTotal")
    @Expose
    private String subTotal;
    @SerializedName("ApprovalRemarks")
    @Expose
    private String approvalRemarks;
    @SerializedName("AssignedTo__name")
    @Expose
    private String assignedToName;
    @SerializedName("AssignedTo__id")
    @Expose
    private String assignedToId;
    @SerializedName("IsRead")
    @Expose
    private String isRead;
    @SerializedName("LocationId__name")
    @Expose
    private String locationIdName;
    @SerializedName("LocationId__id")
    @Expose
    private String locationIdId;
    @SerializedName("LocationId__code")
    @Expose
    private String locationIdCode;
    @SerializedName("SalesOrderStatus__name")
    @Expose
    private String salesOrderStatusName;
    @SerializedName("SalesOrderStatus__id")
    @Expose
    private String salesOrderStatusId;
    @SerializedName("ContactId__name")
    @Expose
    private String contactIdName;
    @SerializedName("ContactId__id")
    @Expose
    private String contactIdId;
    @SerializedName("ContactId__code")
    @Expose
    private String contactIdCode;
    @SerializedName("MailSent")
    @Expose
    private String mailSent;
    @SerializedName("Tax")
    @Expose
    private String tax;
    @SerializedName("OverallDiscount")
    @Expose
    private String overallDiscount;
    @SerializedName("GrandTotal")
    @Expose
    private String grandTotal;
    @SerializedName("Currency__name")
    @Expose
    private String currencyName;
    @SerializedName("Currency__id")
    @Expose
    private String currencyId;
    @SerializedName("ExchangeRate")
    @Expose
    private String exchangeRate;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("AssignedtoOperation__name")
    @Expose
    private String assignedtoOperationName;
    @SerializedName("AssignedtoOperation__id")
    @Expose
    private String assignedtoOperationId;
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("Quote__name")
    @Expose
    private String quoteName;
    @SerializedName("Quote__id")
    @Expose
    private String quoteId;
    @SerializedName("Account__name")
    @Expose
    private String accountName;
    @SerializedName("Account__id")
    @Expose
    private String accountId;
    @SerializedName("Account__code")
    @Expose
    private String accountCode;
    @SerializedName("ServiceType")
    @Expose
    private String serviceType;
    @SerializedName("TotalPaymentReceived")
    @Expose
    private String totalPaymentReceived;
    @SerializedName("iAutoCountId")
    @Expose
    private String iAutoCountId;
    @SerializedName("AOTGSOID")
    @Expose
    private String aotgsoid;
    @SerializedName("lineItems")
    @Expose
    private List<LineItem> lineItems = null;
    @SerializedName("lineItems2")
    @Expose
    private List<LineItems2> lineItems2 = null;
    private final static long serialVersionUID = -686982076230017154L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param date
     * @param serviceType
     * @param createdByName
     * @param transId
     * @param salesOrderStatusId
     * @param locationIdName
     * @param subTotal
     * @param mailSent
     * @param lineItems
     * @param assignedtoOperationId
     * @param modifiedById
     * @param exchangeRate
     * @param assignedtoOperationName
     * @param currencyId
     * @param createdById
     * @param accountCode
     * @param grandTotal
     * @param tax
     * @param contactIdCode
     * @param quoteId
     * @param accountId
     * @param name
     * @param modifiedDate
     * @param syncType
     * @param contactIdId
     * @param status
     * @param quoteName
     * @param assignedToId
     * @param iAutoCountId
     * @param lineItems2
     * @param accountName
     * @param assignedToName
     * @param opportunityIdName
     * @param isRead
     * @param description
     * @param contactIdName
     * @param expiryDate
     * @param modifiedByName
     * @param currencyName
     * @param salesOrderStatusName
     * @param opportunityIdId
     * @param approvalRemarks
     * @param aotgsoid
     * @param locationIdId
     * @param locationIdCode
     * @param createdDate
     * @param totalPaymentReceived
     * @param attributes
     * @param overallDiscount
     */
    public Record(Attributes attributes, String transId, String name, String expiryDate, String opportunityIdName, String opportunityIdId, String description, String syncType, String createdByName, String createdById, String createdDate, String modifiedByName, String modifiedById, String modifiedDate, String subTotal, String approvalRemarks, String assignedToName, String assignedToId, String isRead, String locationIdName, String locationIdId, String locationIdCode, String salesOrderStatusName, String salesOrderStatusId, String contactIdName, String contactIdId, String contactIdCode, String mailSent, String tax, String overallDiscount, String grandTotal, String currencyName, String currencyId, String exchangeRate, String status, String assignedtoOperationName, String assignedtoOperationId, String date, String quoteName, String quoteId, String accountName, String accountId, String accountCode, String serviceType, String totalPaymentReceived, String iAutoCountId, String aotgsoid, List<LineItem> lineItems, List<LineItems2> lineItems2) {
        super();
        this.attributes = attributes;
        this.transId = transId;
        this.name = name;
        this.expiryDate = expiryDate;
        this.opportunityIdName = opportunityIdName;
        this.opportunityIdId = opportunityIdId;
        this.description = description;
        this.syncType = syncType;
        this.createdByName = createdByName;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.modifiedByName = modifiedByName;
        this.modifiedById = modifiedById;
        this.modifiedDate = modifiedDate;
        this.subTotal = subTotal;
        this.approvalRemarks = approvalRemarks;
        this.assignedToName = assignedToName;
        this.assignedToId = assignedToId;
        this.isRead = isRead;
        this.locationIdName = locationIdName;
        this.locationIdId = locationIdId;
        this.locationIdCode = locationIdCode;
        this.salesOrderStatusName = salesOrderStatusName;
        this.salesOrderStatusId = salesOrderStatusId;
        this.contactIdName = contactIdName;
        this.contactIdId = contactIdId;
        this.contactIdCode = contactIdCode;
        this.mailSent = mailSent;
        this.tax = tax;
        this.overallDiscount = overallDiscount;
        this.grandTotal = grandTotal;
        this.currencyName = currencyName;
        this.currencyId = currencyId;
        this.exchangeRate = exchangeRate;
        this.status = status;
        this.assignedtoOperationName = assignedtoOperationName;
        this.assignedtoOperationId = assignedtoOperationId;
        this.date = date;
        this.quoteName = quoteName;
        this.quoteId = quoteId;
        this.accountName = accountName;
        this.accountId = accountId;
        this.accountCode = accountCode;
        this.serviceType = serviceType;
        this.totalPaymentReceived = totalPaymentReceived;
        this.iAutoCountId = iAutoCountId;
        this.aotgsoid = aotgsoid;
        this.lineItems = lineItems;
        this.lineItems2 = lineItems2;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOpportunityIdName() {
        return opportunityIdName;
    }

    public void setOpportunityIdName(String opportunityIdName) {
        this.opportunityIdName = opportunityIdName;
    }

    public String getOpportunityIdId() {
        return opportunityIdId;
    }

    public void setOpportunityIdId(String opportunityIdId) {
        this.opportunityIdId = opportunityIdId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedByName() {
        return modifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        this.modifiedByName = modifiedByName;
    }

    public String getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(String modifiedById) {
        this.modifiedById = modifiedById;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getApprovalRemarks() {
        return approvalRemarks;
    }

    public void setApprovalRemarks(String approvalRemarks) {
        this.approvalRemarks = approvalRemarks;
    }

    public String getAssignedToName() {
        return assignedToName;
    }

    public void setAssignedToName(String assignedToName) {
        this.assignedToName = assignedToName;
    }

    public String getAssignedToId() {
        return assignedToId;
    }

    public void setAssignedToId(String assignedToId) {
        this.assignedToId = assignedToId;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getLocationIdName() {
        return locationIdName;
    }

    public void setLocationIdName(String locationIdName) {
        this.locationIdName = locationIdName;
    }

    public String getLocationIdId() {
        return locationIdId;
    }

    public void setLocationIdId(String locationIdId) {
        this.locationIdId = locationIdId;
    }

    public String getLocationIdCode() {
        return locationIdCode;
    }

    public void setLocationIdCode(String locationIdCode) {
        this.locationIdCode = locationIdCode;
    }

    public String getSalesOrderStatusName() {
        return salesOrderStatusName;
    }

    public void setSalesOrderStatusName(String salesOrderStatusName) {
        this.salesOrderStatusName = salesOrderStatusName;
    }

    public String getSalesOrderStatusId() {
        return salesOrderStatusId;
    }

    public void setSalesOrderStatusId(String salesOrderStatusId) {
        this.salesOrderStatusId = salesOrderStatusId;
    }

    public String getContactIdName() {
        return contactIdName;
    }

    public void setContactIdName(String contactIdName) {
        this.contactIdName = contactIdName;
    }

    public String getContactIdId() {
        return contactIdId;
    }

    public void setContactIdId(String contactIdId) {
        this.contactIdId = contactIdId;
    }

    public String getContactIdCode() {
        return contactIdCode;
    }

    public void setContactIdCode(String contactIdCode) {
        this.contactIdCode = contactIdCode;
    }

    public String getMailSent() {
        return mailSent;
    }

    public void setMailSent(String mailSent) {
        this.mailSent = mailSent;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getOverallDiscount() {
        return overallDiscount;
    }

    public void setOverallDiscount(String overallDiscount) {
        this.overallDiscount = overallDiscount;
    }

    public String getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedtoOperationName() {
        return assignedtoOperationName;
    }

    public void setAssignedtoOperationName(String assignedtoOperationName) {
        this.assignedtoOperationName = assignedtoOperationName;
    }

    public String getAssignedtoOperationId() {
        return assignedtoOperationId;
    }

    public void setAssignedtoOperationId(String assignedtoOperationId) {
        this.assignedtoOperationId = assignedtoOperationId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getTotalPaymentReceived() {
        return totalPaymentReceived;
    }

    public void setTotalPaymentReceived(String totalPaymentReceived) {
        this.totalPaymentReceived = totalPaymentReceived;
    }

    public String getiAutoCountId() {
        return iAutoCountId;
    }

    public void setiAutoCountId(String iAutoCountId) {
        this.iAutoCountId = iAutoCountId;
    }

    public String getAotgsoid() {
        return aotgsoid;
    }

    public void setAotgsoid(String aotgsoid) {
        this.aotgsoid = aotgsoid;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public List<LineItems2> getLineItems2() {
        return lineItems2;
    }

    public void setLineItems2(List<LineItems2> lineItems2) {
        this.lineItems2 = lineItems2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Record.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null)?"<null>":this.attributes));
        sb.append(',');
        sb.append("transId");
        sb.append('=');
        sb.append(((this.transId == null)?"<null>":this.transId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("opportunityIdName");
        sb.append('=');
        sb.append(((this.opportunityIdName == null)?"<null>":this.opportunityIdName));
        sb.append(',');
        sb.append("opportunityIdId");
        sb.append('=');
        sb.append(((this.opportunityIdId == null)?"<null>":this.opportunityIdId));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("syncType");
        sb.append('=');
        sb.append(((this.syncType == null)?"<null>":this.syncType));
        sb.append(',');
        sb.append("createdByName");
        sb.append('=');
        sb.append(((this.createdByName == null)?"<null>":this.createdByName));
        sb.append(',');
        sb.append("createdById");
        sb.append('=');
        sb.append(((this.createdById == null)?"<null>":this.createdById));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("modifiedByName");
        sb.append('=');
        sb.append(((this.modifiedByName == null)?"<null>":this.modifiedByName));
        sb.append(',');
        sb.append("modifiedById");
        sb.append('=');
        sb.append(((this.modifiedById == null)?"<null>":this.modifiedById));
        sb.append(',');
        sb.append("modifiedDate");
        sb.append('=');
        sb.append(((this.modifiedDate == null)?"<null>":this.modifiedDate));
        sb.append(',');
        sb.append("subTotal");
        sb.append('=');
        sb.append(((this.subTotal == null)?"<null>":this.subTotal));
        sb.append(',');
        sb.append("approvalRemarks");
        sb.append('=');
        sb.append(((this.approvalRemarks == null)?"<null>":this.approvalRemarks));
        sb.append(',');
        sb.append("assignedToName");
        sb.append('=');
        sb.append(((this.assignedToName == null)?"<null>":this.assignedToName));
        sb.append(',');
        sb.append("assignedToId");
        sb.append('=');
        sb.append(((this.assignedToId == null)?"<null>":this.assignedToId));
        sb.append(',');
        sb.append("isRead");
        sb.append('=');
        sb.append(((this.isRead == null)?"<null>":this.isRead));
        sb.append(',');
        sb.append("locationIdName");
        sb.append('=');
        sb.append(((this.locationIdName == null)?"<null>":this.locationIdName));
        sb.append(',');
        sb.append("locationIdId");
        sb.append('=');
        sb.append(((this.locationIdId == null)?"<null>":this.locationIdId));
        sb.append(',');
        sb.append("locationIdCode");
        sb.append('=');
        sb.append(((this.locationIdCode == null)?"<null>":this.locationIdCode));
        sb.append(',');
        sb.append("salesOrderStatusName");
        sb.append('=');
        sb.append(((this.salesOrderStatusName == null)?"<null>":this.salesOrderStatusName));
        sb.append(',');
        sb.append("salesOrderStatusId");
        sb.append('=');
        sb.append(((this.salesOrderStatusId == null)?"<null>":this.salesOrderStatusId));
        sb.append(',');
        sb.append("contactIdName");
        sb.append('=');
        sb.append(((this.contactIdName == null)?"<null>":this.contactIdName));
        sb.append(',');
        sb.append("contactIdId");
        sb.append('=');
        sb.append(((this.contactIdId == null)?"<null>":this.contactIdId));
        sb.append(',');
        sb.append("contactIdCode");
        sb.append('=');
        sb.append(((this.contactIdCode == null)?"<null>":this.contactIdCode));
        sb.append(',');
        sb.append("mailSent");
        sb.append('=');
        sb.append(((this.mailSent == null)?"<null>":this.mailSent));
        sb.append(',');
        sb.append("tax");
        sb.append('=');
        sb.append(((this.tax == null)?"<null>":this.tax));
        sb.append(',');
        sb.append("overallDiscount");
        sb.append('=');
        sb.append(((this.overallDiscount == null)?"<null>":this.overallDiscount));
        sb.append(',');
        sb.append("grandTotal");
        sb.append('=');
        sb.append(((this.grandTotal == null)?"<null>":this.grandTotal));
        sb.append(',');
        sb.append("currencyName");
        sb.append('=');
        sb.append(((this.currencyName == null)?"<null>":this.currencyName));
        sb.append(',');
        sb.append("currencyId");
        sb.append('=');
        sb.append(((this.currencyId == null)?"<null>":this.currencyId));
        sb.append(',');
        sb.append("exchangeRate");
        sb.append('=');
        sb.append(((this.exchangeRate == null)?"<null>":this.exchangeRate));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("assignedtoOperationName");
        sb.append('=');
        sb.append(((this.assignedtoOperationName == null)?"<null>":this.assignedtoOperationName));
        sb.append(',');
        sb.append("assignedtoOperationId");
        sb.append('=');
        sb.append(((this.assignedtoOperationId == null)?"<null>":this.assignedtoOperationId));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("quoteName");
        sb.append('=');
        sb.append(((this.quoteName == null)?"<null>":this.quoteName));
        sb.append(',');
        sb.append("quoteId");
        sb.append('=');
        sb.append(((this.quoteId == null)?"<null>":this.quoteId));
        sb.append(',');
        sb.append("accountName");
        sb.append('=');
        sb.append(((this.accountName == null)?"<null>":this.accountName));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("accountCode");
        sb.append('=');
        sb.append(((this.accountCode == null)?"<null>":this.accountCode));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("totalPaymentReceived");
        sb.append('=');
        sb.append(((this.totalPaymentReceived == null)?"<null>":this.totalPaymentReceived));
        sb.append(',');
        sb.append("iAutoCountId");
        sb.append('=');
        sb.append(((this.iAutoCountId == null)?"<null>":this.iAutoCountId));
        sb.append(',');
        sb.append("aotgsoid");
        sb.append('=');
        sb.append(((this.aotgsoid == null)?"<null>":this.aotgsoid));
        sb.append(',');
        sb.append("lineItems");
        sb.append('=');
        sb.append(((this.lineItems == null)?"<null>":this.lineItems));
        sb.append(',');
        sb.append("lineItems2");
        sb.append('=');
        sb.append(((this.lineItems2 == null)?"<null>":this.lineItems2));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
