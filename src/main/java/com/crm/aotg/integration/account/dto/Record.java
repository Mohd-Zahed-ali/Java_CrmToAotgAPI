package com.crm.aotg.integration.account.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Record implements Serializable
{

    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("MasterId")
    @Expose
    private String masterId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("AccountType")
    @Expose
    private String accountType;
    @SerializedName("CreditLimit")
    @Expose
    private String creditLimit;
    @SerializedName("CreditDays")
    @Expose
    private String creditDays;
    @SerializedName("IsGroup")
    @Expose
    private String isGroup;
    @SerializedName("CreatedBy__name")
    @Expose
    private String createdByName;
    @SerializedName("CreatedBy__id")
    @Expose
    private String createdById;
    @SerializedName("ModifiedBy__name")
    @Expose
    private String modifiedByName;
    @SerializedName("ModifiedBy__id")
    @Expose
    private String modifiedById;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("ModifiedDate")
    @Expose
    private String modifiedDate;
    @SerializedName("UnitStatus__name")
    @Expose
    private String unitStatusName;
    @SerializedName("UnitStatus__id")
    @Expose
    private String unitStatusId;
    @SerializedName("BillingStreet")
    @Expose
    private String billingStreet;
    @SerializedName("ShippingStreet")
    @Expose
    private String shippingStreet;
    @SerializedName("WorkArea__name")
    @Expose
    private String workAreaName;
    @SerializedName("WorkArea__id")
    @Expose
    private String workAreaId;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("Phone")
    @Expose
    private String phone;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("AssignedTo__name")
    @Expose
    private String assignedToName;
    @SerializedName("AssignedTo__id")
    @Expose
    private String assignedToId;
    @SerializedName("ParentAccount__name")
    @Expose
    private String parentAccountName;
    @SerializedName("ParentAccount__id")
    @Expose
    private String parentAccountId;
    @SerializedName("ParentAccount__code")
    @Expose
    private String parentAccountCode;
    @SerializedName("Industry__name")
    @Expose
    private String industryName;
    @SerializedName("Industry__id")
    @Expose
    private String industryId;
    @SerializedName("Fax")
    @Expose
    private String fax;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("BillingAddress")
    @Expose
    private String billingAddress;
    @SerializedName("BillingCity")
    @Expose
    private String billingCity;
    @SerializedName("BillingPinCode")
    @Expose
    private String billingPinCode;
    @SerializedName("BillingState")
    @Expose
    private String billingState;
    @SerializedName("BillingCountry__name")
    @Expose
    private String billingCountryName;
    @SerializedName("BillingCountry__id")
    @Expose
    private String billingCountryId;
    @SerializedName("BillingCountry__code")
    @Expose
    private String billingCountryCode;
    @SerializedName("ShippingAddress")
    @Expose
    private String shippingAddress;
    @SerializedName("ShippingCity")
    @Expose
    private String shippingCity;
    @SerializedName("ShippingPinCode")
    @Expose
    private String shippingPinCode;
    @SerializedName("ShippingState")
    @Expose
    private String shippingState;
    @SerializedName("ShippingCountry__name")
    @Expose
    private String shippingCountryName;
    @SerializedName("ShippingCountry__id")
    @Expose
    private String shippingCountryId;
    @SerializedName("ShippingCountry__code")
    @Expose
    private String shippingCountryCode;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("AnnualRevenue")
    @Expose
    private String annualRevenue;
    @SerializedName("IsRead")
    @Expose
    private String isRead;
    @SerializedName("Unsubscribe")
    @Expose
    private String unsubscribe;
    @SerializedName("InvalidEmail")
    @Expose
    private String invalidEmail;
    @SerializedName("Location__name")
    @Expose
    private String locationName;
    @SerializedName("Location__id")
    @Expose
    private String locationId;
    @SerializedName("Location__code")
    @Expose
    private String locationCode;
    @SerializedName("iAutoCountId")
    @Expose
    private String iAutoCountId;
    @SerializedName("ComRegistration")
    @Expose
    private String comRegistration;
    @SerializedName("iCreditTerm")
    @Expose
    private String iCreditTerm;
    @SerializedName("sInvoiceContact")
    @Expose
    private String sInvoiceContact;
    @SerializedName("sDeliveryContact")
    @Expose
    private String sDeliveryContact;
    private final static long serialVersionUID = 8553697365440965196L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param createdByName
     * @param shippingCity
     * @param sInvoiceContact
     * @param billingCountryName
     * @param shippingPinCode
     * @param parentAccountId
     * @param industryId
     * @param modifiedById
     * @param billingCountryCode
     * @param unsubscribe
     * @param creditLimit
     * @param fax
     * @param createdById
     * @param invalidEmail
     * @param creditDays
     * @param accountType
     * @param parentAccountCode
     * @param billingState
     * @param iCreditTerm
     * @param phone
     * @param sDeliveryContact
     * @param name
     * @param modifiedDate
     * @param shippingState
     * @param isGroup
     * @param locationCode
     * @param annualRevenue
     * @param assignedToId
     * @param iAutoCountId
     * @param code
     * @param city
     * @param shippingStreet
     * @param assignedToName
     * @param comRegistration
     * @param workAreaId
     * @param isRead
     * @param description
     * @param parentAccountName
     * @param modifiedByName
     * @param locationId
     * @param billingPinCode
     * @param shippingCountryName
     * @param unitStatusId
     * @param email
     * @param industryName
     * @param website
     * @param locationName
     * @param shippingCountryId
     * @param masterId
     * @param createdDate
     * @param shippingCountryCode
     * @param billingStreet
     * @param shippingAddress
     * @param attributes
     * @param billingAddress
     * @param billingCountryId
     * @param workAreaName
     * @param unitStatusName
     * @param billingCity
     */
    public Record(Attributes attributes, String masterId, String name, String code, String accountType, String creditLimit, String creditDays, String isGroup, String createdByName, String createdById, String modifiedByName, String modifiedById, String createdDate, String modifiedDate, String unitStatusName, String unitStatusId, String billingStreet, String shippingStreet, String workAreaName, String workAreaId, String city, String phone, String email, String assignedToName, String assignedToId, String parentAccountName, String parentAccountId, String parentAccountCode, String industryName, String industryId, String fax, String website, String billingAddress, String billingCity, String billingPinCode, String billingState, String billingCountryName, String billingCountryId, String billingCountryCode, String shippingAddress, String shippingCity, String shippingPinCode, String shippingState, String shippingCountryName, String shippingCountryId, String shippingCountryCode, String description, String annualRevenue, String isRead, String unsubscribe, String invalidEmail, String locationName, String locationId, String locationCode, String iAutoCountId, String comRegistration, String iCreditTerm, String sInvoiceContact, String sDeliveryContact) {
        super();
        this.attributes = attributes;
        this.masterId = masterId;
        this.name = name;
        this.code = code;
        this.accountType = accountType;
        this.creditLimit = creditLimit;
        this.creditDays = creditDays;
        this.isGroup = isGroup;
        this.createdByName = createdByName;
        this.createdById = createdById;
        this.modifiedByName = modifiedByName;
        this.modifiedById = modifiedById;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.unitStatusName = unitStatusName;
        this.unitStatusId = unitStatusId;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.workAreaName = workAreaName;
        this.workAreaId = workAreaId;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.assignedToName = assignedToName;
        this.assignedToId = assignedToId;
        this.parentAccountName = parentAccountName;
        this.parentAccountId = parentAccountId;
        this.parentAccountCode = parentAccountCode;
        this.industryName = industryName;
        this.industryId = industryId;
        this.fax = fax;
        this.website = website;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingPinCode = billingPinCode;
        this.billingState = billingState;
        this.billingCountryName = billingCountryName;
        this.billingCountryId = billingCountryId;
        this.billingCountryCode = billingCountryCode;
        this.shippingAddress = shippingAddress;
        this.shippingCity = shippingCity;
        this.shippingPinCode = shippingPinCode;
        this.shippingState = shippingState;
        this.shippingCountryName = shippingCountryName;
        this.shippingCountryId = shippingCountryId;
        this.shippingCountryCode = shippingCountryCode;
        this.description = description;
        this.annualRevenue = annualRevenue;
        this.isRead = isRead;
        this.unsubscribe = unsubscribe;
        this.invalidEmail = invalidEmail;
        this.locationName = locationName;
        this.locationId = locationId;
        this.locationCode = locationCode;
        this.iAutoCountId = iAutoCountId;
        this.comRegistration = comRegistration;
        this.iCreditTerm = iCreditTerm;
        this.sInvoiceContact = sInvoiceContact;
        this.sDeliveryContact = sDeliveryContact;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCreditDays() {
        return creditDays;
    }

    public void setCreditDays(String creditDays) {
        this.creditDays = creditDays;
    }

    public String getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(String isGroup) {
        this.isGroup = isGroup;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getUnitStatusName() {
        return unitStatusName;
    }

    public void setUnitStatusName(String unitStatusName) {
        this.unitStatusName = unitStatusName;
    }

    public String getUnitStatusId() {
        return unitStatusId;
    }

    public void setUnitStatusId(String unitStatusId) {
        this.unitStatusId = unitStatusId;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getWorkAreaName() {
        return workAreaName;
    }

    public void setWorkAreaName(String workAreaName) {
        this.workAreaName = workAreaName;
    }

    public String getWorkAreaId() {
        return workAreaId;
    }

    public void setWorkAreaId(String workAreaId) {
        this.workAreaId = workAreaId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getParentAccountName() {
        return parentAccountName;
    }

    public void setParentAccountName(String parentAccountName) {
        this.parentAccountName = parentAccountName;
    }

    public String getParentAccountId() {
        return parentAccountId;
    }

    public void setParentAccountId(String parentAccountId) {
        this.parentAccountId = parentAccountId;
    }

    public String getParentAccountCode() {
        return parentAccountCode;
    }

    public void setParentAccountCode(String parentAccountCode) {
        this.parentAccountCode = parentAccountCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingPinCode() {
        return billingPinCode;
    }

    public void setBillingPinCode(String billingPinCode) {
        this.billingPinCode = billingPinCode;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingCountryName() {
        return billingCountryName;
    }

    public void setBillingCountryName(String billingCountryName) {
        this.billingCountryName = billingCountryName;
    }

    public String getBillingCountryId() {
        return billingCountryId;
    }

    public void setBillingCountryId(String billingCountryId) {
        this.billingCountryId = billingCountryId;
    }

    public String getBillingCountryCode() {
        return billingCountryCode;
    }

    public void setBillingCountryCode(String billingCountryCode) {
        this.billingCountryCode = billingCountryCode;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingPinCode() {
        return shippingPinCode;
    }

    public void setShippingPinCode(String shippingPinCode) {
        this.shippingPinCode = shippingPinCode;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingCountryName() {
        return shippingCountryName;
    }

    public void setShippingCountryName(String shippingCountryName) {
        this.shippingCountryName = shippingCountryName;
    }

    public String getShippingCountryId() {
        return shippingCountryId;
    }

    public void setShippingCountryId(String shippingCountryId) {
        this.shippingCountryId = shippingCountryId;
    }

    public String getShippingCountryCode() {
        return shippingCountryCode;
    }

    public void setShippingCountryCode(String shippingCountryCode) {
        this.shippingCountryCode = shippingCountryCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getUnsubscribe() {
        return unsubscribe;
    }

    public void setUnsubscribe(String unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getiAutoCountId() {
        return iAutoCountId;
    }

    public void setiAutoCountId(String iAutoCountId) {
        this.iAutoCountId = iAutoCountId;
    }

    public String getComRegistration() {
        return comRegistration;
    }

    public void setComRegistration(String comRegistration) {
        this.comRegistration = comRegistration;
    }

    public String getiCreditTerm() {
        return iCreditTerm;
    }

    public void setiCreditTerm(String iCreditTerm) {
        this.iCreditTerm = iCreditTerm;
    }

    public String getsInvoiceContact() {
        return sInvoiceContact;
    }

    public void setsInvoiceContact(String sInvoiceContact) {
        this.sInvoiceContact = sInvoiceContact;
    }

    public String getsDeliveryContact() {
        return sDeliveryContact;
    }

    public void setsDeliveryContact(String sDeliveryContact) {
        this.sDeliveryContact = sDeliveryContact;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Record.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null)?"<null>":this.attributes));
        sb.append(',');
        sb.append("masterId");
        sb.append('=');
        sb.append(((this.masterId == null)?"<null>":this.masterId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("accountType");
        sb.append('=');
        sb.append(((this.accountType == null)?"<null>":this.accountType));
        sb.append(',');
        sb.append("creditLimit");
        sb.append('=');
        sb.append(((this.creditLimit == null)?"<null>":this.creditLimit));
        sb.append(',');
        sb.append("creditDays");
        sb.append('=');
        sb.append(((this.creditDays == null)?"<null>":this.creditDays));
        sb.append(',');
        sb.append("isGroup");
        sb.append('=');
        sb.append(((this.isGroup == null)?"<null>":this.isGroup));
        sb.append(',');
        sb.append("createdByName");
        sb.append('=');
        sb.append(((this.createdByName == null)?"<null>":this.createdByName));
        sb.append(',');
        sb.append("createdById");
        sb.append('=');
        sb.append(((this.createdById == null)?"<null>":this.createdById));
        sb.append(',');
        sb.append("modifiedByName");
        sb.append('=');
        sb.append(((this.modifiedByName == null)?"<null>":this.modifiedByName));
        sb.append(',');
        sb.append("modifiedById");
        sb.append('=');
        sb.append(((this.modifiedById == null)?"<null>":this.modifiedById));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("modifiedDate");
        sb.append('=');
        sb.append(((this.modifiedDate == null)?"<null>":this.modifiedDate));
        sb.append(',');
        sb.append("unitStatusName");
        sb.append('=');
        sb.append(((this.unitStatusName == null)?"<null>":this.unitStatusName));
        sb.append(',');
        sb.append("unitStatusId");
        sb.append('=');
        sb.append(((this.unitStatusId == null)?"<null>":this.unitStatusId));
        sb.append(',');
        sb.append("billingStreet");
        sb.append('=');
        sb.append(((this.billingStreet == null)?"<null>":this.billingStreet));
        sb.append(',');
        sb.append("shippingStreet");
        sb.append('=');
        sb.append(((this.shippingStreet == null)?"<null>":this.shippingStreet));
        sb.append(',');
        sb.append("workAreaName");
        sb.append('=');
        sb.append(((this.workAreaName == null)?"<null>":this.workAreaName));
        sb.append(',');
        sb.append("workAreaId");
        sb.append('=');
        sb.append(((this.workAreaId == null)?"<null>":this.workAreaId));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("assignedToName");
        sb.append('=');
        sb.append(((this.assignedToName == null)?"<null>":this.assignedToName));
        sb.append(',');
        sb.append("assignedToId");
        sb.append('=');
        sb.append(((this.assignedToId == null)?"<null>":this.assignedToId));
        sb.append(',');
        sb.append("parentAccountName");
        sb.append('=');
        sb.append(((this.parentAccountName == null)?"<null>":this.parentAccountName));
        sb.append(',');
        sb.append("parentAccountId");
        sb.append('=');
        sb.append(((this.parentAccountId == null)?"<null>":this.parentAccountId));
        sb.append(',');
        sb.append("parentAccountCode");
        sb.append('=');
        sb.append(((this.parentAccountCode == null)?"<null>":this.parentAccountCode));
        sb.append(',');
        sb.append("industryName");
        sb.append('=');
        sb.append(((this.industryName == null)?"<null>":this.industryName));
        sb.append(',');
        sb.append("industryId");
        sb.append('=');
        sb.append(((this.industryId == null)?"<null>":this.industryId));
        sb.append(',');
        sb.append("fax");
        sb.append('=');
        sb.append(((this.fax == null)?"<null>":this.fax));
        sb.append(',');
        sb.append("website");
        sb.append('=');
        sb.append(((this.website == null)?"<null>":this.website));
        sb.append(',');
        sb.append("billingAddress");
        sb.append('=');
        sb.append(((this.billingAddress == null)?"<null>":this.billingAddress));
        sb.append(',');
        sb.append("billingCity");
        sb.append('=');
        sb.append(((this.billingCity == null)?"<null>":this.billingCity));
        sb.append(',');
        sb.append("billingPinCode");
        sb.append('=');
        sb.append(((this.billingPinCode == null)?"<null>":this.billingPinCode));
        sb.append(',');
        sb.append("billingState");
        sb.append('=');
        sb.append(((this.billingState == null)?"<null>":this.billingState));
        sb.append(',');
        sb.append("billingCountryName");
        sb.append('=');
        sb.append(((this.billingCountryName == null)?"<null>":this.billingCountryName));
        sb.append(',');
        sb.append("billingCountryId");
        sb.append('=');
        sb.append(((this.billingCountryId == null)?"<null>":this.billingCountryId));
        sb.append(',');
        sb.append("billingCountryCode");
        sb.append('=');
        sb.append(((this.billingCountryCode == null)?"<null>":this.billingCountryCode));
        sb.append(',');
        sb.append("shippingAddress");
        sb.append('=');
        sb.append(((this.shippingAddress == null)?"<null>":this.shippingAddress));
        sb.append(',');
        sb.append("shippingCity");
        sb.append('=');
        sb.append(((this.shippingCity == null)?"<null>":this.shippingCity));
        sb.append(',');
        sb.append("shippingPinCode");
        sb.append('=');
        sb.append(((this.shippingPinCode == null)?"<null>":this.shippingPinCode));
        sb.append(',');
        sb.append("shippingState");
        sb.append('=');
        sb.append(((this.shippingState == null)?"<null>":this.shippingState));
        sb.append(',');
        sb.append("shippingCountryName");
        sb.append('=');
        sb.append(((this.shippingCountryName == null)?"<null>":this.shippingCountryName));
        sb.append(',');
        sb.append("shippingCountryId");
        sb.append('=');
        sb.append(((this.shippingCountryId == null)?"<null>":this.shippingCountryId));
        sb.append(',');
        sb.append("shippingCountryCode");
        sb.append('=');
        sb.append(((this.shippingCountryCode == null)?"<null>":this.shippingCountryCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("annualRevenue");
        sb.append('=');
        sb.append(((this.annualRevenue == null)?"<null>":this.annualRevenue));
        sb.append(',');
        sb.append("isRead");
        sb.append('=');
        sb.append(((this.isRead == null)?"<null>":this.isRead));
        sb.append(',');
        sb.append("unsubscribe");
        sb.append('=');
        sb.append(((this.unsubscribe == null)?"<null>":this.unsubscribe));
        sb.append(',');
        sb.append("invalidEmail");
        sb.append('=');
        sb.append(((this.invalidEmail == null)?"<null>":this.invalidEmail));
        sb.append(',');
        sb.append("locationName");
        sb.append('=');
        sb.append(((this.locationName == null)?"<null>":this.locationName));
        sb.append(',');
        sb.append("locationId");
        sb.append('=');
        sb.append(((this.locationId == null)?"<null>":this.locationId));
        sb.append(',');
        sb.append("locationCode");
        sb.append('=');
        sb.append(((this.locationCode == null)?"<null>":this.locationCode));
        sb.append(',');
        sb.append("iAutoCountId");
        sb.append('=');
        sb.append(((this.iAutoCountId == null)?"<null>":this.iAutoCountId));
        sb.append(',');
        sb.append("comRegistration");
        sb.append('=');
        sb.append(((this.comRegistration == null)?"<null>":this.comRegistration));
        sb.append(',');
        sb.append("iCreditTerm");
        sb.append('=');
        sb.append(((this.iCreditTerm == null)?"<null>":this.iCreditTerm));
        sb.append(',');
        sb.append("sInvoiceContact");
        sb.append('=');
        sb.append(((this.sInvoiceContact == null)?"<null>":this.sInvoiceContact));
        sb.append(',');
        sb.append("sDeliveryContact");
        sb.append('=');
        sb.append(((this.sDeliveryContact == null)?"<null>":this.sDeliveryContact));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
