
package com.crm.aotg.integration.account.dto;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CLAccountDto implements Serializable {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("AccNo")
    @Expose
    private String accNo;
    @SerializedName("CompanyName")
    @Expose
    private String companyName;
    @SerializedName("RegisterNo")
    @Expose
    private String registerNo;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("InvoiceAddress")
    @Expose
    private InvoiceAddress invoiceAddress;
    @SerializedName("DeliverAddress")
    @Expose
    private DeliverAddress deliverAddress;
    @SerializedName("SalesAgent")
    @Expose
    private String salesAgent;
    @SerializedName("CreditTerm")
    @Expose
    private String creditTerm;
    @SerializedName("CreditLimit")
    @Expose
    private Float creditLimit;
    @SerializedName("NatureOfBusiness")
    @Expose
    private String natureOfBusiness;
    @SerializedName("WebURL")
    @Expose
    private String webURL;
    @SerializedName("EmailAddress")
    @Expose
    private String emailAddress;
    @SerializedName("Outstanding")
    @Expose
    private Float outstanding;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("CurrencySymbol")
    @Expose
    private String currencySymbol;
    @SerializedName("BlockExceedCreditLimit")
    @Expose
    private Boolean blockExceedCreditLimit;
    @SerializedName("TaxCode")
    @Expose
    private String taxCode;
    @SerializedName("TaxRegistrationNo")
    @Expose
    private String taxRegistrationNo;
    @SerializedName("IsTaxRegistered")
    @Expose
    private Boolean isTaxRegistered;
    @SerializedName("GSTStatusVerifiedDate")
    @Expose
    private Object gSTStatusVerifiedDate;
    @SerializedName("IsInclusiveTax")
    @Expose
    private Boolean isInclusiveTax;
    @SerializedName("Area")
    @Expose
    private String area;
    @SerializedName("PriceCategory")
    @Expose
    private String priceCategory;
    @SerializedName("DetailDiscount")
    @Expose
    private Object detailDiscount;
    @SerializedName("SalesExemptionNo")
    @Expose
    private String salesExemptionNo;
    @SerializedName("SalesExemptionExpiryDate")
    @Expose
    private Object salesExemptionExpiryDate;
    @SerializedName("MultiPrice")
    @Expose
    private Object multiPrice;
    @SerializedName("BranchList")
    @Expose
    private List<Object> branchList = null;
    @SerializedName("TaxEexamplexemptionList")
    @Expose
    private List<Object> taxEexamplexemptionList = null;
    private final static long serialVersionUID = -3691626475785013863L;

    /**
     * No args constructor for use in serialization
     */
    public CLAccountDto() {
    }

    /**
     * @param blockExceedCreditLimit
     * @param taxEexamplexemptionList
     * @param branchList
     * @param companyName
     * @param description
     * @param invoiceAddress
     * @param natureOfBusiness
     * @param deliverAddress
     * @param isActive
     * @param registerNo
     * @param emailAddress
     * @param salesAgent
     * @param creditTerm
     * @param priceCategory
     * @param creditLimit
     * @param id
     * @param isInclusiveTax
     * @param area
     * @param outstanding
     * @param accNo
     * @param currencySymbol
     * @param taxCode
     * @param salesExemptionNo
     * @param detailDiscount
     * @param taxRegistrationNo
     * @param salesExemptionExpiryDate
     * @param webURL
     * @param multiPrice
     * @param gSTStatusVerifiedDate
     * @param currencyCode
     * @param isTaxRegistered
     */
    public CLAccountDto(String id, String accNo, String companyName, String registerNo, String description, InvoiceAddress invoiceAddress, DeliverAddress deliverAddress, String salesAgent, String creditTerm, Float creditLimit, String natureOfBusiness, String webURL, String emailAddress, Float outstanding, Boolean isActive, String currencyCode, String currencySymbol, Boolean blockExceedCreditLimit, String taxCode, String taxRegistrationNo, Boolean isTaxRegistered, Object gSTStatusVerifiedDate, Boolean isInclusiveTax, String area, String priceCategory, Object detailDiscount, String salesExemptionNo, Object salesExemptionExpiryDate, Object multiPrice, List<Object> branchList, List<Object> taxEexamplexemptionList) {
        super();
        this.id = id;
        this.accNo = accNo;
        this.companyName = companyName;
        this.registerNo = registerNo;
        this.description = description;
        this.invoiceAddress = invoiceAddress;
        this.deliverAddress = deliverAddress;
        this.salesAgent = salesAgent;
        this.creditTerm = creditTerm;
        this.creditLimit = creditLimit;
        this.natureOfBusiness = natureOfBusiness;
        this.webURL = webURL;
        this.emailAddress = emailAddress;
        this.outstanding = outstanding;
        this.isActive = isActive;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.blockExceedCreditLimit = blockExceedCreditLimit;
        this.taxCode = taxCode;
        this.taxRegistrationNo = taxRegistrationNo;
        this.isTaxRegistered = isTaxRegistered;
        this.gSTStatusVerifiedDate = gSTStatusVerifiedDate;
        this.isInclusiveTax = isInclusiveTax;
        this.area = area;
        this.priceCategory = priceCategory;
        this.detailDiscount = detailDiscount;
        this.salesExemptionNo = salesExemptionNo;
        this.salesExemptionExpiryDate = salesExemptionExpiryDate;
        this.multiPrice = multiPrice;
        this.branchList = branchList;
        this.taxEexamplexemptionList = taxEexamplexemptionList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InvoiceAddress getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(InvoiceAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public DeliverAddress getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(DeliverAddress deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    public String getSalesAgent() {
        return salesAgent;
    }

    public void setSalesAgent(String salesAgent) {
        this.salesAgent = salesAgent;
    }

    public String getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(String creditTerm) {
        this.creditTerm = creditTerm;
    }

    public Float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Float getOutstanding() {
        return outstanding;
    }

    public void setOutstanding(Float outstanding) {
        this.outstanding = outstanding;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public Boolean getBlockExceedCreditLimit() {
        return blockExceedCreditLimit;
    }

    public void setBlockExceedCreditLimit(Boolean blockExceedCreditLimit) {
        this.blockExceedCreditLimit = blockExceedCreditLimit;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxRegistrationNo() {
        return taxRegistrationNo;
    }

    public void setTaxRegistrationNo(String taxRegistrationNo) {
        this.taxRegistrationNo = taxRegistrationNo;
    }

    public Boolean getIsTaxRegistered() {
        return isTaxRegistered;
    }

    public void setIsTaxRegistered(Boolean isTaxRegistered) {
        this.isTaxRegistered = isTaxRegistered;
    }

    public Object getGSTStatusVerifiedDate() {
        return gSTStatusVerifiedDate;
    }

    public void setGSTStatusVerifiedDate(Object gSTStatusVerifiedDate) {
        this.gSTStatusVerifiedDate = gSTStatusVerifiedDate;
    }

    public Boolean getIsInclusiveTax() {
        return isInclusiveTax;
    }

    public void setIsInclusiveTax(Boolean isInclusiveTax) {
        this.isInclusiveTax = isInclusiveTax;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public Object getDetailDiscount() {
        return detailDiscount;
    }

    public void setDetailDiscount(Object detailDiscount) {
        this.detailDiscount = detailDiscount;
    }

    public String getSalesExemptionNo() {
        return salesExemptionNo;
    }

    public void setSalesExemptionNo(String salesExemptionNo) {
        this.salesExemptionNo = salesExemptionNo;
    }

    public Object getSalesExemptionExpiryDate() {
        return salesExemptionExpiryDate;
    }

    public void setSalesExemptionExpiryDate(Object salesExemptionExpiryDate) {
        this.salesExemptionExpiryDate = salesExemptionExpiryDate;
    }

    public Object getMultiPrice() {
        return multiPrice;
    }

    public void setMultiPrice(Object multiPrice) {
        this.multiPrice = multiPrice;
    }

    public List<Object> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<Object> branchList) {
        this.branchList = branchList;
    }

    public List<Object> getTaxEexamplexemptionList() {
        return taxEexamplexemptionList;
    }

    public void setTaxEexamplexemptionList(List<Object> taxEexamplexemptionList) {
        this.taxEexamplexemptionList = taxEexamplexemptionList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLAccountDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("accNo");
        sb.append('=');
        sb.append(((this.accNo == null) ? "<null>" : this.accNo));
        sb.append(',');
        sb.append("companyName");
        sb.append('=');
        sb.append(((this.companyName == null) ? "<null>" : this.companyName));
        sb.append(',');
        sb.append("registerNo");
        sb.append('=');
        sb.append(((this.registerNo == null) ? "<null>" : this.registerNo));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("invoiceAddress");
        sb.append('=');
        sb.append(((this.invoiceAddress == null) ? "<null>" : this.invoiceAddress));
        sb.append(',');
        sb.append("deliverAddress");
        sb.append('=');
        sb.append(((this.deliverAddress == null) ? "<null>" : this.deliverAddress));
        sb.append(',');
        sb.append("salesAgent");
        sb.append('=');
        sb.append(((this.salesAgent == null) ? "<null>" : this.salesAgent));
        sb.append(',');
        sb.append("creditTerm");
        sb.append('=');
        sb.append(((this.creditTerm == null) ? "<null>" : this.creditTerm));
        sb.append(',');
        sb.append("creditLimit");
        sb.append('=');
        sb.append(((this.creditLimit == null) ? "<null>" : this.creditLimit));
        sb.append(',');
        sb.append("natureOfBusiness");
        sb.append('=');
        sb.append(((this.natureOfBusiness == null) ? "<null>" : this.natureOfBusiness));
        sb.append(',');
        sb.append("webURL");
        sb.append('=');
        sb.append(((this.webURL == null) ? "<null>" : this.webURL));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null) ? "<null>" : this.emailAddress));
        sb.append(',');
        sb.append("outstanding");
        sb.append('=');
        sb.append(((this.outstanding == null) ? "<null>" : this.outstanding));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null) ? "<null>" : this.isActive));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null) ? "<null>" : this.currencyCode));
        sb.append(',');
        sb.append("currencySymbol");
        sb.append('=');
        sb.append(((this.currencySymbol == null) ? "<null>" : this.currencySymbol));
        sb.append(',');
        sb.append("blockExceedCreditLimit");
        sb.append('=');
        sb.append(((this.blockExceedCreditLimit == null) ? "<null>" : this.blockExceedCreditLimit));
        sb.append(',');
        sb.append("taxCode");
        sb.append('=');
        sb.append(((this.taxCode == null) ? "<null>" : this.taxCode));
        sb.append(',');
        sb.append("taxRegistrationNo");
        sb.append('=');
        sb.append(((this.taxRegistrationNo == null) ? "<null>" : this.taxRegistrationNo));
        sb.append(',');
        sb.append("isTaxRegistered");
        sb.append('=');
        sb.append(((this.isTaxRegistered == null) ? "<null>" : this.isTaxRegistered));
        sb.append(',');
        sb.append("gSTStatusVerifiedDate");
        sb.append('=');
        sb.append(((this.gSTStatusVerifiedDate == null) ? "<null>" : this.gSTStatusVerifiedDate));
        sb.append(',');
        sb.append("isInclusiveTax");
        sb.append('=');
        sb.append(((this.isInclusiveTax == null) ? "<null>" : this.isInclusiveTax));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null) ? "<null>" : this.area));
        sb.append(',');
        sb.append("priceCategory");
        sb.append('=');
        sb.append(((this.priceCategory == null) ? "<null>" : this.priceCategory));
        sb.append(',');
        sb.append("detailDiscount");
        sb.append('=');
        sb.append(((this.detailDiscount == null) ? "<null>" : this.detailDiscount));
        sb.append(',');
        sb.append("salesExemptionNo");
        sb.append('=');
        sb.append(((this.salesExemptionNo == null) ? "<null>" : this.salesExemptionNo));
        sb.append(',');
        sb.append("salesExemptionExpiryDate");
        sb.append('=');
        sb.append(((this.salesExemptionExpiryDate == null) ? "<null>" : this.salesExemptionExpiryDate));
        sb.append(',');
        sb.append("multiPrice");
        sb.append('=');
        sb.append(((this.multiPrice == null) ? "<null>" : this.multiPrice));
        sb.append(',');
        sb.append("branchList");
        sb.append('=');
        sb.append(((this.branchList == null) ? "<null>" : this.branchList));
        sb.append(',');
        sb.append("taxEexamplexemptionList");
        sb.append('=');
        sb.append(((this.taxEexamplexemptionList == null) ? "<null>" : this.taxEexamplexemptionList));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
