
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DetailsLine implements Serializable {

    @SerializedName("Item")
    @Expose
    private String item;
    @SerializedName("UOM")
    @Expose
    private String uom;
    @SerializedName("IsGoodsReturn")
    @Expose
    private Boolean isGoodsReturn;
    @SerializedName("TransferedQty")
    @Expose
    private Double transferedQty;
    @SerializedName("IsTransferred")
    @Expose
    private Boolean isTransferred;
    @SerializedName("UDFLineDatas")
    @Expose
    private Object uDFLineDatas;
    @SerializedName("Qty")
    @Expose
    private Double qty;
    @SerializedName("UnitPrice")
    @Expose
    private Double unitPrice;
    @SerializedName("Tax")
    @Expose
    private String tax;
    @SerializedName("TaxRate")
    @Expose
    private Double taxRate;
    @SerializedName("TaxAmount")
    @Expose
    private Double taxAmount;
    @SerializedName("SubTotal")
    @Expose
    private Double subTotal;
    @SerializedName("SubTotalExTax")
    @Expose
    private Double subTotalExTax;
    @SerializedName("TaxableAmount")
    @Expose
    private Double taxableAmount;
    @SerializedName("Discount")
    @Expose
    private String discount;
    @SerializedName("DiscountAmount")
    @Expose
    private Double discountAmount;
    @SerializedName("SmallestQty")
    @Expose
    private Double smallestQty;
    @SerializedName("SmallestUnitPrice")
    @Expose
    private Double smallestUnitPrice;
    @SerializedName("LocalTaxAmount")
    @Expose
    private Double localTaxAmount;
    @SerializedName("LocalSubTotal")
    @Expose
    private Double localSubTotal;
    @SerializedName("LocalSubTotalExTax")
    @Expose
    private Double localSubTotalExTax;
    @SerializedName("LocalTaxableAmount")
    @Expose
    private Double localTaxableAmount;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("FurtherDescription")
    @Expose
    private String furtherDescription;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("RowState")
    @Expose
    private Integer rowState;
    @SerializedName("FromDocType")
    @Expose
    private String fromDocType;
    @SerializedName("FromDocNo")
    @Expose
    private String fromDocNo;
    @SerializedName("FromDocDtlKey")
    @Expose
    private String fromDocDtlKey;
    @SerializedName("FullTransferFromDocList")
    @Expose
    private String fullTransferFromDocList;
    @SerializedName("AccNo")
    @Expose
    private Object accNo;
    @SerializedName("IsFromFullTransferredLine")
    @Expose
    private Boolean isFromFullTransferredLine;
    @SerializedName("IsFromPartialTransferredLine")
    @Expose
    private Boolean isFromPartialTransferredLine;
    @SerializedName("TransferFromDocumentType")
    @Expose
    private Integer transferFromDocumentType;
    @SerializedName("IsTempTransferLine")
    @Expose
    private Boolean isTempTransferLine;
    @SerializedName("LineIndex")
    @Expose
    private Integer lineIndex;
    @SerializedName("Project")
    @Expose
    private String project;
    @SerializedName("Dept")
    @Expose
    private String dept;
    @SerializedName("DeliveryDate")
    @Expose
    private String deliveryDate;
    @SerializedName("SalesTaxExemptionNo")
    @Expose
    private String salesTaxExemptionNo;
    @SerializedName("TariffCode")
    @Expose
    private Object tariffCode;
    @SerializedName("Numbering")
    @Expose
    private String numbering;
    private final static long serialVersionUID = 4777413778839286966L;

    /**
     * No args constructor for use in serialization
     */
    public DetailsLine() {
    }

    /**
     * @param fromDocType
     * @param isFromPartialTransferredLine
     * @param tariffCode
     * @param isTransferred
     * @param subTotalExTax
     * @param fromDocDtlKey
     * @param lineIndex
     * @param discount
     * @param discountAmount
     * @param description
     * @param project
     * @param salesTaxExemptionNo
     * @param subTotal
     * @param transferFromDocumentType
     * @param isGoodsReturn
     * @param transferedQty
     * @param furtherDescription
     * @param uom
     * @param localSubTotal
     * @param localTaxableAmount
     * @param uDFLineDatas
     * @param id
     * @param deliveryDate
     * @param fromDocNo
     * @param unitPrice
     * @param taxableAmount
     * @param numbering
     * @param item
     * @param smallestQty
     * @param rowState
     * @param isTempTransferLine
     * @param accNo
     * @param localSubTotalExTax
     * @param tax
     * @param dept
     * @param isFromFullTransferredLine
     * @param smallestUnitPrice
     * @param localTaxAmount
     * @param taxRate
     * @param fullTransferFromDocList
     * @param qty
     * @param location
     * @param taxAmount
     */
    public DetailsLine(String item, String uom, Boolean isGoodsReturn, Double transferedQty, Boolean isTransferred, Object uDFLineDatas, Double qty, Double unitPrice, String tax, Double taxRate, Double taxAmount, Double subTotal, Double subTotalExTax, Double taxableAmount, String discount, Double discountAmount, Double smallestQty, Double smallestUnitPrice, Double localTaxAmount, Double localSubTotal, Double localSubTotalExTax, Double localTaxableAmount, String id, String description, String furtherDescription, String location, Integer rowState, String fromDocType, String fromDocNo, String fromDocDtlKey, String fullTransferFromDocList, Object accNo, Boolean isFromFullTransferredLine, Boolean isFromPartialTransferredLine, Integer transferFromDocumentType, Boolean isTempTransferLine, Integer lineIndex, String project, String dept, String deliveryDate, String salesTaxExemptionNo, Object tariffCode, String numbering) {
        super();
        this.item = item;
        this.uom = uom;
        this.isGoodsReturn = isGoodsReturn;
        this.transferedQty = transferedQty;
        this.isTransferred = isTransferred;
        this.uDFLineDatas = uDFLineDatas;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.tax = tax;
        this.taxRate = taxRate;
        this.taxAmount = taxAmount;
        this.subTotal = subTotal;
        this.subTotalExTax = subTotalExTax;
        this.taxableAmount = taxableAmount;
        this.discount = discount;
        this.discountAmount = discountAmount;
        this.smallestQty = smallestQty;
        this.smallestUnitPrice = smallestUnitPrice;
        this.localTaxAmount = localTaxAmount;
        this.localSubTotal = localSubTotal;
        this.localSubTotalExTax = localSubTotalExTax;
        this.localTaxableAmount = localTaxableAmount;
        this.id = id;
        this.description = description;
        this.furtherDescription = furtherDescription;
        this.location = location;
        this.rowState = rowState;
        this.fromDocType = fromDocType;
        this.fromDocNo = fromDocNo;
        this.fromDocDtlKey = fromDocDtlKey;
        this.fullTransferFromDocList = fullTransferFromDocList;
        this.accNo = accNo;
        this.isFromFullTransferredLine = isFromFullTransferredLine;
        this.isFromPartialTransferredLine = isFromPartialTransferredLine;
        this.transferFromDocumentType = transferFromDocumentType;
        this.isTempTransferLine = isTempTransferLine;
        this.lineIndex = lineIndex;
        this.project = project;
        this.dept = dept;
        this.deliveryDate = deliveryDate;
        this.salesTaxExemptionNo = salesTaxExemptionNo;
        this.tariffCode = tariffCode;
        this.numbering = numbering;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Boolean getIsGoodsReturn() {
        return isGoodsReturn;
    }

    public void setIsGoodsReturn(Boolean isGoodsReturn) {
        this.isGoodsReturn = isGoodsReturn;
    }

    public Double getTransferedQty() {
        return transferedQty;
    }

    public void setTransferedQty(Double transferedQty) {
        this.transferedQty = transferedQty;
    }

    public Boolean getIsTransferred() {
        return isTransferred;
    }

    public void setIsTransferred(Boolean isTransferred) {
        this.isTransferred = isTransferred;
    }

    public Object getUDFLineDatas() {
        return uDFLineDatas;
    }

    public void setUDFLineDatas(Object uDFLineDatas) {
        this.uDFLineDatas = uDFLineDatas;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getSubTotalExTax() {
        return subTotalExTax;
    }

    public void setSubTotalExTax(Double subTotalExTax) {
        this.subTotalExTax = subTotalExTax;
    }

    public Double getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(Double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getSmallestQty() {
        return smallestQty;
    }

    public void setSmallestQty(Double smallestQty) {
        this.smallestQty = smallestQty;
    }

    public Double getSmallestUnitPrice() {
        return smallestUnitPrice;
    }

    public void setSmallestUnitPrice(Double smallestUnitPrice) {
        this.smallestUnitPrice = smallestUnitPrice;
    }

    public Double getLocalTaxAmount() {
        return localTaxAmount;
    }

    public void setLocalTaxAmount(Double localTaxAmount) {
        this.localTaxAmount = localTaxAmount;
    }

    public Double getLocalSubTotal() {
        return localSubTotal;
    }

    public void setLocalSubTotal(Double localSubTotal) {
        this.localSubTotal = localSubTotal;
    }

    public Double getLocalSubTotalExTax() {
        return localSubTotalExTax;
    }

    public void setLocalSubTotalExTax(Double localSubTotalExTax) {
        this.localSubTotalExTax = localSubTotalExTax;
    }

    public Double getLocalTaxableAmount() {
        return localTaxableAmount;
    }

    public void setLocalTaxableAmount(Double localTaxableAmount) {
        this.localTaxableAmount = localTaxableAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFurtherDescription() {
        return furtherDescription;
    }

    public void setFurtherDescription(String furtherDescription) {
        this.furtherDescription = furtherDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getRowState() {
        return rowState;
    }

    public void setRowState(Integer rowState) {
        this.rowState = rowState;
    }

    public String getFromDocType() {
        return fromDocType;
    }

    public void setFromDocType(String fromDocType) {
        this.fromDocType = fromDocType;
    }

    public String getFromDocNo() {
        return fromDocNo;
    }

    public void setFromDocNo(String fromDocNo) {
        this.fromDocNo = fromDocNo;
    }

    public String getFromDocDtlKey() {
        return fromDocDtlKey;
    }

    public void setFromDocDtlKey(String fromDocDtlKey) {
        this.fromDocDtlKey = fromDocDtlKey;
    }

    public String getFullTransferFromDocList() {
        return fullTransferFromDocList;
    }

    public void setFullTransferFromDocList(String fullTransferFromDocList) {
        this.fullTransferFromDocList = fullTransferFromDocList;
    }

    public Object getAccNo() {
        return accNo;
    }

    public void setAccNo(Object accNo) {
        this.accNo = accNo;
    }

    public Boolean getIsFromFullTransferredLine() {
        return isFromFullTransferredLine;
    }

    public void setIsFromFullTransferredLine(Boolean isFromFullTransferredLine) {
        this.isFromFullTransferredLine = isFromFullTransferredLine;
    }

    public Boolean getIsFromPartialTransferredLine() {
        return isFromPartialTransferredLine;
    }

    public void setIsFromPartialTransferredLine(Boolean isFromPartialTransferredLine) {
        this.isFromPartialTransferredLine = isFromPartialTransferredLine;
    }

    public Integer getTransferFromDocumentType() {
        return transferFromDocumentType;
    }

    public void setTransferFromDocumentType(Integer transferFromDocumentType) {
        this.transferFromDocumentType = transferFromDocumentType;
    }

    public Boolean getIsTempTransferLine() {
        return isTempTransferLine;
    }

    public void setIsTempTransferLine(Boolean isTempTransferLine) {
        this.isTempTransferLine = isTempTransferLine;
    }

    public Integer getLineIndex() {
        return lineIndex;
    }

    public void setLineIndex(Integer lineIndex) {
        this.lineIndex = lineIndex;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getSalesTaxExemptionNo() {
        return salesTaxExemptionNo;
    }

    public void setSalesTaxExemptionNo(String salesTaxExemptionNo) {
        this.salesTaxExemptionNo = salesTaxExemptionNo;
    }

    public Object getTariffCode() {
        return tariffCode;
    }

    public void setTariffCode(Object tariffCode) {
        this.tariffCode = tariffCode;
    }

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetailsLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null) ? "<null>" : this.item));
        sb.append(',');
        sb.append("uom");
        sb.append('=');
        sb.append(((this.uom == null) ? "<null>" : this.uom));
        sb.append(',');
        sb.append("isGoodsReturn");
        sb.append('=');
        sb.append(((this.isGoodsReturn == null) ? "<null>" : this.isGoodsReturn));
        sb.append(',');
        sb.append("transferedQty");
        sb.append('=');
        sb.append(((this.transferedQty == null) ? "<null>" : this.transferedQty));
        sb.append(',');
        sb.append("isTransferred");
        sb.append('=');
        sb.append(((this.isTransferred == null) ? "<null>" : this.isTransferred));
        sb.append(',');
        sb.append("uDFLineDatas");
        sb.append('=');
        sb.append(((this.uDFLineDatas == null) ? "<null>" : this.uDFLineDatas));
        sb.append(',');
        sb.append("qty");
        sb.append('=');
        sb.append(((this.qty == null) ? "<null>" : this.qty));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null) ? "<null>" : this.unitPrice));
        sb.append(',');
        sb.append("tax");
        sb.append('=');
        sb.append(((this.tax == null) ? "<null>" : this.tax));
        sb.append(',');
        sb.append("taxRate");
        sb.append('=');
        sb.append(((this.taxRate == null) ? "<null>" : this.taxRate));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null) ? "<null>" : this.taxAmount));
        sb.append(',');
        sb.append("subTotal");
        sb.append('=');
        sb.append(((this.subTotal == null) ? "<null>" : this.subTotal));
        sb.append(',');
        sb.append("subTotalExTax");
        sb.append('=');
        sb.append(((this.subTotalExTax == null) ? "<null>" : this.subTotalExTax));
        sb.append(',');
        sb.append("taxableAmount");
        sb.append('=');
        sb.append(((this.taxableAmount == null) ? "<null>" : this.taxableAmount));
        sb.append(',');
        sb.append("discount");
        sb.append('=');
        sb.append(((this.discount == null) ? "<null>" : this.discount));
        sb.append(',');
        sb.append("discountAmount");
        sb.append('=');
        sb.append(((this.discountAmount == null) ? "<null>" : this.discountAmount));
        sb.append(',');
        sb.append("smallestQty");
        sb.append('=');
        sb.append(((this.smallestQty == null) ? "<null>" : this.smallestQty));
        sb.append(',');
        sb.append("smallestUnitPrice");
        sb.append('=');
        sb.append(((this.smallestUnitPrice == null) ? "<null>" : this.smallestUnitPrice));
        sb.append(',');
        sb.append("localTaxAmount");
        sb.append('=');
        sb.append(((this.localTaxAmount == null) ? "<null>" : this.localTaxAmount));
        sb.append(',');
        sb.append("localSubTotal");
        sb.append('=');
        sb.append(((this.localSubTotal == null) ? "<null>" : this.localSubTotal));
        sb.append(',');
        sb.append("localSubTotalExTax");
        sb.append('=');
        sb.append(((this.localSubTotalExTax == null) ? "<null>" : this.localSubTotalExTax));
        sb.append(',');
        sb.append("localTaxableAmount");
        sb.append('=');
        sb.append(((this.localTaxableAmount == null) ? "<null>" : this.localTaxableAmount));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("furtherDescription");
        sb.append('=');
        sb.append(((this.furtherDescription == null) ? "<null>" : this.furtherDescription));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null) ? "<null>" : this.location));
        sb.append(',');
        sb.append("rowState");
        sb.append('=');
        sb.append(((this.rowState == null) ? "<null>" : this.rowState));
        sb.append(',');
        sb.append("fromDocType");
        sb.append('=');
        sb.append(((this.fromDocType == null) ? "<null>" : this.fromDocType));
        sb.append(',');
        sb.append("fromDocNo");
        sb.append('=');
        sb.append(((this.fromDocNo == null) ? "<null>" : this.fromDocNo));
        sb.append(',');
        sb.append("fromDocDtlKey");
        sb.append('=');
        sb.append(((this.fromDocDtlKey == null) ? "<null>" : this.fromDocDtlKey));
        sb.append(',');
        sb.append("fullTransferFromDocList");
        sb.append('=');
        sb.append(((this.fullTransferFromDocList == null) ? "<null>" : this.fullTransferFromDocList));
        sb.append(',');
        sb.append("accNo");
        sb.append('=');
        sb.append(((this.accNo == null) ? "<null>" : this.accNo));
        sb.append(',');
        sb.append("isFromFullTransferredLine");
        sb.append('=');
        sb.append(((this.isFromFullTransferredLine == null) ? "<null>" : this.isFromFullTransferredLine));
        sb.append(',');
        sb.append("isFromPartialTransferredLine");
        sb.append('=');
        sb.append(((this.isFromPartialTransferredLine == null) ? "<null>" : this.isFromPartialTransferredLine));
        sb.append(',');
        sb.append("transferFromDocumentType");
        sb.append('=');
        sb.append(((this.transferFromDocumentType == null) ? "<null>" : this.transferFromDocumentType));
        sb.append(',');
        sb.append("isTempTransferLine");
        sb.append('=');
        sb.append(((this.isTempTransferLine == null) ? "<null>" : this.isTempTransferLine));
        sb.append(',');
        sb.append("lineIndex");
        sb.append('=');
        sb.append(((this.lineIndex == null) ? "<null>" : this.lineIndex));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null) ? "<null>" : this.project));
        sb.append(',');
        sb.append("dept");
        sb.append('=');
        sb.append(((this.dept == null) ? "<null>" : this.dept));
        sb.append(',');
        sb.append("deliveryDate");
        sb.append('=');
        sb.append(((this.deliveryDate == null) ? "<null>" : this.deliveryDate));
        sb.append(',');
        sb.append("salesTaxExemptionNo");
        sb.append('=');
        sb.append(((this.salesTaxExemptionNo == null) ? "<null>" : this.salesTaxExemptionNo));
        sb.append(',');
        sb.append("tariffCode");
        sb.append('=');
        sb.append(((this.tariffCode == null) ? "<null>" : this.tariffCode));
        sb.append(',');
        sb.append("numbering");
        sb.append('=');
        sb.append(((this.numbering == null) ? "<null>" : this.numbering));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
