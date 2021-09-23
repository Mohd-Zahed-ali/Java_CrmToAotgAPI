
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CLSalesOrderDto implements Serializable {

    @SerializedName("Debtor")
    @Expose
    private String debtor;
    @SerializedName("DebtorName")
    @Expose
    private String debtorName;
    @SerializedName("Contact")
    @Expose
    private String contact;
    @SerializedName("Fax")
    @Expose
    private String fax;
    @SerializedName("Phone")
    @Expose
    private String phone;
    @SerializedName("DeliverAddress")
    @Expose
    private DeliverAddress deliverAddress;
    @SerializedName("InvoiceAddress")
    @Expose
    private InvoiceAddress invoiceAddress;
    @SerializedName("Agent")
    @Expose
    private String agent;
    @SerializedName("SalesLocation")
    @Expose
    private String salesLocation;
    @SerializedName("DocumentDate")
    @Expose
    private String documentDate;
    @SerializedName("CreditTerm")
    @Expose
    private String creditTerm;
    @SerializedName("ShipVia")
    @Expose
    private String shipVia;
    @SerializedName("ShipInfo")
    @Expose
    private String shipInfo;
    @SerializedName("InclusiveTax")
    @Expose
    private Boolean inclusiveTax;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Ref")
    @Expose
    private String ref;
    @SerializedName("RefDocNo")
    @Expose
    private String refDocNo;
    @SerializedName("Note")
    @Expose
    private String note;
    @SerializedName("DetailsLine")
    @Expose
    private List<DetailsLine> detailsLine = null;
    @SerializedName("TransferDetails")
    @Expose
    private List<Object> transferDetails = null;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Number")
    @Expose
    private String number;
    @SerializedName("TaxAmount")
    @Expose
    private Double taxAmount;
    @SerializedName("Total")
    @Expose
    private Double total;
    @SerializedName("NetTotal")
    @Expose
    private Double netTotal;
    @SerializedName("IsRoundAdj")
    @Expose
    private Boolean isRoundAdj;
    @SerializedName("RoundingMethod")
    @Expose
    private Integer roundingMethod;
    @SerializedName("RoundAdj")
    @Expose
    private Double roundAdj;
    @SerializedName("IsCancelled")
    @Expose
    private Boolean isCancelled;
    @SerializedName("ToDocType")
    @Expose
    private String toDocType;
    @SerializedName("ToDocKey")
    @Expose
    private String toDocKey;
    @SerializedName("IsTransferred")
    @Expose
    private Boolean isTransferred;
    @SerializedName("TransferFromQuotationDocument")
    @Expose
    private TransferFromQuotationDocument transferFromQuotationDocument;
    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("CurrencySymbol")
    @Expose
    private String currencySymbol;
    @SerializedName("CurrencyRate")
    @Expose
    private Double currencyRate;
    @SerializedName("LocalNetTotal")
    @Expose
    private Double localNetTotal;
    @SerializedName("LocalTaxAmount")
    @Expose
    private Double localTaxAmount;
    @SerializedName("Branch")
    @Expose
    private String branch;
    @SerializedName("SalesTaxExemptionNo")
    @Expose
    private String salesTaxExemptionNo;
    @SerializedName("SalesTaxExemptionExpiryDate")
    @Expose
    private Object salesTaxExemptionExpiryDate;
    @SerializedName("Transferable")
    @Expose
    private Boolean transferable;
    @SerializedName("EnableBranch")
    @Expose
    private Boolean enableBranch;
    @SerializedName("ValidateBackOrder")
    @Expose
    private Boolean validateBackOrder;
    @SerializedName("ValidateMinMaxPrice")
    @Expose
    private Boolean validateMinMaxPrice;
    @SerializedName("LastModified")
    @Expose
    private String lastModified;
    private final static long serialVersionUID = -8857251144165451006L;

    /**
     * No args constructor for use in serialization
     */
    public CLSalesOrderDto() {
    }

    /**
     * @param documentDate
     * @param detailsLine
     * @param note
     * @param agent
     * @param roundAdj
     * @param isTransferred
     * @param toDocType
     * @param inclusiveTax
     * @param transferable
     * @param description
     * @param invoiceAddress
     * @param salesTaxExemptionNo
     * @param deliverAddress
     * @param enableBranch
     * @param roundingMethod
     * @param toDocKey
     * @param branch
     * @param number
     * @param shipVia
     * @param ref
     * @param total
     * @param debtor
     * @param transferDetails
     * @param contact
     * @param creditTerm
     * @param localNetTotal
     * @param id
     * @param fax
     * @param refDocNo
     * @param isCancelled
     * @param shipInfo
     * @param validateBackOrder
     * @param salesLocation
     * @param currencySymbol
     * @param debtorName
     * @param validateMinMaxPrice
     * @param localTaxAmount
     * @param phone
     * @param isRoundAdj
     * @param transferFromQuotationDocument
     * @param netTotal
     * @param currencyRate
     * @param lastModified
     * @param taxAmount
     * @param currencyCode
     * @param salesTaxExemptionExpiryDate
     */
    public CLSalesOrderDto(String debtor, String debtorName, String contact, String fax, String phone, DeliverAddress deliverAddress, InvoiceAddress invoiceAddress, String agent, String salesLocation, String documentDate, String creditTerm, String shipVia, String shipInfo, Boolean inclusiveTax, String description, String ref, String refDocNo, String note, List<DetailsLine> detailsLine, List<Object> transferDetails, String id, String number, Double taxAmount, Double total, Double netTotal, Boolean isRoundAdj, Integer roundingMethod, Double roundAdj, Boolean isCancelled, String toDocType, String toDocKey, Boolean isTransferred, TransferFromQuotationDocument transferFromQuotationDocument, String currencyCode, String currencySymbol, Double currencyRate, Double localNetTotal, Double localTaxAmount, String branch, String salesTaxExemptionNo, Object salesTaxExemptionExpiryDate, Boolean transferable, Boolean enableBranch, Boolean validateBackOrder, Boolean validateMinMaxPrice, String lastModified) {
        super();
        this.debtor = debtor;
        this.debtorName = debtorName;
        this.contact = contact;
        this.fax = fax;
        this.phone = phone;
        this.deliverAddress = deliverAddress;
        this.invoiceAddress = invoiceAddress;
        this.agent = agent;
        this.salesLocation = salesLocation;
        this.documentDate = documentDate;
        this.creditTerm = creditTerm;
        this.shipVia = shipVia;
        this.shipInfo = shipInfo;
        this.inclusiveTax = inclusiveTax;
        this.description = description;
        this.ref = ref;
        this.refDocNo = refDocNo;
        this.note = note;
        this.detailsLine = detailsLine;
        this.transferDetails = transferDetails;
        this.id = id;
        this.number = number;
        this.taxAmount = taxAmount;
        this.total = total;
        this.netTotal = netTotal;
        this.isRoundAdj = isRoundAdj;
        this.roundingMethod = roundingMethod;
        this.roundAdj = roundAdj;
        this.isCancelled = isCancelled;
        this.toDocType = toDocType;
        this.toDocKey = toDocKey;
        this.isTransferred = isTransferred;
        this.transferFromQuotationDocument = transferFromQuotationDocument;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.currencyRate = currencyRate;
        this.localNetTotal = localNetTotal;
        this.localTaxAmount = localTaxAmount;
        this.branch = branch;
        this.salesTaxExemptionNo = salesTaxExemptionNo;
        this.salesTaxExemptionExpiryDate = salesTaxExemptionExpiryDate;
        this.transferable = transferable;
        this.enableBranch = enableBranch;
        this.validateBackOrder = validateBackOrder;
        this.validateMinMaxPrice = validateMinMaxPrice;
        this.lastModified = lastModified;
    }

    public String getDebtor() {
        return debtor;
    }

    public void setDebtor(String debtor) {
        this.debtor = debtor;
    }

    public String getDebtorName() {
        return debtorName;
    }

    public void setDebtorName(String debtorName) {
        this.debtorName = debtorName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DeliverAddress getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(DeliverAddress deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    public InvoiceAddress getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(InvoiceAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getSalesLocation() {
        return salesLocation;
    }

    public void setSalesLocation(String salesLocation) {
        this.salesLocation = salesLocation;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public String getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(String creditTerm) {
        this.creditTerm = creditTerm;
    }

    public String getShipVia() {
        return shipVia;
    }

    public void setShipVia(String shipVia) {
        this.shipVia = shipVia;
    }

    public String getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(String shipInfo) {
        this.shipInfo = shipInfo;
    }

    public Boolean getInclusiveTax() {
        return inclusiveTax;
    }

    public void setInclusiveTax(Boolean inclusiveTax) {
        this.inclusiveTax = inclusiveTax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRefDocNo() {
        return refDocNo;
    }

    public void setRefDocNo(String refDocNo) {
        this.refDocNo = refDocNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<DetailsLine> getDetailsLine() {
        return detailsLine;
    }

    public void setDetailsLine(List<DetailsLine> detailsLine) {
        this.detailsLine = detailsLine;
    }

    public List<Object> getTransferDetails() {
        return transferDetails;
    }

    public void setTransferDetails(List<Object> transferDetails) {
        this.transferDetails = transferDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(Double netTotal) {
        this.netTotal = netTotal;
    }

    public Boolean getIsRoundAdj() {
        return isRoundAdj;
    }

    public void setIsRoundAdj(Boolean isRoundAdj) {
        this.isRoundAdj = isRoundAdj;
    }

    public Integer getRoundingMethod() {
        return roundingMethod;
    }

    public void setRoundingMethod(Integer roundingMethod) {
        this.roundingMethod = roundingMethod;
    }

    public Double getRoundAdj() {
        return roundAdj;
    }

    public void setRoundAdj(Double roundAdj) {
        this.roundAdj = roundAdj;
    }

    public Boolean getIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    public String getToDocType() {
        return toDocType;
    }

    public void setToDocType(String toDocType) {
        this.toDocType = toDocType;
    }

    public String getToDocKey() {
        return toDocKey;
    }

    public void setToDocKey(String toDocKey) {
        this.toDocKey = toDocKey;
    }

    public Boolean getIsTransferred() {
        return isTransferred;
    }

    public void setIsTransferred(Boolean isTransferred) {
        this.isTransferred = isTransferred;
    }

    public TransferFromQuotationDocument getTransferFromQuotationDocument() {
        return transferFromQuotationDocument;
    }

    public void setTransferFromQuotationDocument(TransferFromQuotationDocument transferFromQuotationDocument) {
        this.transferFromQuotationDocument = transferFromQuotationDocument;
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

    public Double getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public Double getLocalNetTotal() {
        return localNetTotal;
    }

    public void setLocalNetTotal(Double localNetTotal) {
        this.localNetTotal = localNetTotal;
    }

    public Double getLocalTaxAmount() {
        return localTaxAmount;
    }

    public void setLocalTaxAmount(Double localTaxAmount) {
        this.localTaxAmount = localTaxAmount;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSalesTaxExemptionNo() {
        return salesTaxExemptionNo;
    }

    public void setSalesTaxExemptionNo(String salesTaxExemptionNo) {
        this.salesTaxExemptionNo = salesTaxExemptionNo;
    }

    public Object getSalesTaxExemptionExpiryDate() {
        return salesTaxExemptionExpiryDate;
    }

    public void setSalesTaxExemptionExpiryDate(Object salesTaxExemptionExpiryDate) {
        this.salesTaxExemptionExpiryDate = salesTaxExemptionExpiryDate;
    }

    public Boolean getTransferable() {
        return transferable;
    }

    public void setTransferable(Boolean transferable) {
        this.transferable = transferable;
    }

    public Boolean getEnableBranch() {
        return enableBranch;
    }

    public void setEnableBranch(Boolean enableBranch) {
        this.enableBranch = enableBranch;
    }

    public Boolean getValidateBackOrder() {
        return validateBackOrder;
    }

    public void setValidateBackOrder(Boolean validateBackOrder) {
        this.validateBackOrder = validateBackOrder;
    }

    public Boolean getValidateMinMaxPrice() {
        return validateMinMaxPrice;
    }

    public void setValidateMinMaxPrice(Boolean validateMinMaxPrice) {
        this.validateMinMaxPrice = validateMinMaxPrice;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLSalesOrderDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("debtor");
        sb.append('=');
        sb.append(((this.debtor == null) ? "<null>" : this.debtor));
        sb.append(',');
        sb.append("debtorName");
        sb.append('=');
        sb.append(((this.debtorName == null) ? "<null>" : this.debtorName));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null) ? "<null>" : this.contact));
        sb.append(',');
        sb.append("fax");
        sb.append('=');
        sb.append(((this.fax == null) ? "<null>" : this.fax));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null) ? "<null>" : this.phone));
        sb.append(',');
        sb.append("deliverAddress");
        sb.append('=');
        sb.append(((this.deliverAddress == null) ? "<null>" : this.deliverAddress));
        sb.append(',');
        sb.append("invoiceAddress");
        sb.append('=');
        sb.append(((this.invoiceAddress == null) ? "<null>" : this.invoiceAddress));
        sb.append(',');
        sb.append("agent");
        sb.append('=');
        sb.append(((this.agent == null) ? "<null>" : this.agent));
        sb.append(',');
        sb.append("salesLocation");
        sb.append('=');
        sb.append(((this.salesLocation == null) ? "<null>" : this.salesLocation));
        sb.append(',');
        sb.append("documentDate");
        sb.append('=');
        sb.append(((this.documentDate == null) ? "<null>" : this.documentDate));
        sb.append(',');
        sb.append("creditTerm");
        sb.append('=');
        sb.append(((this.creditTerm == null) ? "<null>" : this.creditTerm));
        sb.append(',');
        sb.append("shipVia");
        sb.append('=');
        sb.append(((this.shipVia == null) ? "<null>" : this.shipVia));
        sb.append(',');
        sb.append("shipInfo");
        sb.append('=');
        sb.append(((this.shipInfo == null) ? "<null>" : this.shipInfo));
        sb.append(',');
        sb.append("inclusiveTax");
        sb.append('=');
        sb.append(((this.inclusiveTax == null) ? "<null>" : this.inclusiveTax));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("ref");
        sb.append('=');
        sb.append(((this.ref == null) ? "<null>" : this.ref));
        sb.append(',');
        sb.append("refDocNo");
        sb.append('=');
        sb.append(((this.refDocNo == null) ? "<null>" : this.refDocNo));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null) ? "<null>" : this.note));
        sb.append(',');
        sb.append("detailsLine");
        sb.append('=');
        sb.append(((this.detailsLine == null) ? "<null>" : this.detailsLine));
        sb.append(',');
        sb.append("transferDetails");
        sb.append('=');
        sb.append(((this.transferDetails == null) ? "<null>" : this.transferDetails));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null) ? "<null>" : this.number));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null) ? "<null>" : this.taxAmount));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null) ? "<null>" : this.total));
        sb.append(',');
        sb.append("netTotal");
        sb.append('=');
        sb.append(((this.netTotal == null) ? "<null>" : this.netTotal));
        sb.append(',');
        sb.append("isRoundAdj");
        sb.append('=');
        sb.append(((this.isRoundAdj == null) ? "<null>" : this.isRoundAdj));
        sb.append(',');
        sb.append("roundingMethod");
        sb.append('=');
        sb.append(((this.roundingMethod == null) ? "<null>" : this.roundingMethod));
        sb.append(',');
        sb.append("roundAdj");
        sb.append('=');
        sb.append(((this.roundAdj == null) ? "<null>" : this.roundAdj));
        sb.append(',');
        sb.append("isCancelled");
        sb.append('=');
        sb.append(((this.isCancelled == null) ? "<null>" : this.isCancelled));
        sb.append(',');
        sb.append("toDocType");
        sb.append('=');
        sb.append(((this.toDocType == null) ? "<null>" : this.toDocType));
        sb.append(',');
        sb.append("toDocKey");
        sb.append('=');
        sb.append(((this.toDocKey == null) ? "<null>" : this.toDocKey));
        sb.append(',');
        sb.append("isTransferred");
        sb.append('=');
        sb.append(((this.isTransferred == null) ? "<null>" : this.isTransferred));
        sb.append(',');
        sb.append("transferFromQuotationDocument");
        sb.append('=');
        sb.append(((this.transferFromQuotationDocument == null) ? "<null>" : this.transferFromQuotationDocument));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null) ? "<null>" : this.currencyCode));
        sb.append(',');
        sb.append("currencySymbol");
        sb.append('=');
        sb.append(((this.currencySymbol == null) ? "<null>" : this.currencySymbol));
        sb.append(',');
        sb.append("currencyRate");
        sb.append('=');
        sb.append(((this.currencyRate == null) ? "<null>" : this.currencyRate));
        sb.append(',');
        sb.append("localNetTotal");
        sb.append('=');
        sb.append(((this.localNetTotal == null) ? "<null>" : this.localNetTotal));
        sb.append(',');
        sb.append("localTaxAmount");
        sb.append('=');
        sb.append(((this.localTaxAmount == null) ? "<null>" : this.localTaxAmount));
        sb.append(',');
        sb.append("branch");
        sb.append('=');
        sb.append(((this.branch == null) ? "<null>" : this.branch));
        sb.append(',');
        sb.append("salesTaxExemptionNo");
        sb.append('=');
        sb.append(((this.salesTaxExemptionNo == null) ? "<null>" : this.salesTaxExemptionNo));
        sb.append(',');
        sb.append("salesTaxExemptionExpiryDate");
        sb.append('=');
        sb.append(((this.salesTaxExemptionExpiryDate == null) ? "<null>" : this.salesTaxExemptionExpiryDate));
        sb.append(',');
        sb.append("transferable");
        sb.append('=');
        sb.append(((this.transferable == null) ? "<null>" : this.transferable));
        sb.append(',');
        sb.append("enableBranch");
        sb.append('=');
        sb.append(((this.enableBranch == null) ? "<null>" : this.enableBranch));
        sb.append(',');
        sb.append("validateBackOrder");
        sb.append('=');
        sb.append(((this.validateBackOrder == null) ? "<null>" : this.validateBackOrder));
        sb.append(',');
        sb.append("validateMinMaxPrice");
        sb.append('=');
        sb.append(((this.validateMinMaxPrice == null) ? "<null>" : this.validateMinMaxPrice));
        sb.append(',');
        sb.append("lastModified");
        sb.append('=');
        sb.append(((this.lastModified == null) ? "<null>" : this.lastModified));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
