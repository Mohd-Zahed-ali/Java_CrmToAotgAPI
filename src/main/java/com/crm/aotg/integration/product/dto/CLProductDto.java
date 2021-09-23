
package com.crm.aotg.integration.product.dto;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CLProductDto implements Serializable {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("ItemCode")
    @Expose
    private String itemCode;
    @SerializedName("ItemDescription")
    @Expose
    private String itemDescription;
    @SerializedName("ItemDescription2")
    @Expose
    private String itemDescription2;
    @SerializedName("ItemGroup")
    @Expose
    private String itemGroup;
    @SerializedName("ItemType")
    @Expose
    private String itemType;
    @SerializedName("BaseUOM")
    @Expose
    private String baseUOM;
    @SerializedName("SalesUOM")
    @Expose
    private String salesUOM;
    @SerializedName("PurchaseUOM")
    @Expose
    private String purchaseUOM;
    @SerializedName("ReportUOM")
    @Expose
    private String reportUOM;
    @SerializedName("UOM")
    @Expose
    private List<Uom> uom = null;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("Discontinued")
    @Expose
    private Boolean discontinued;
    @SerializedName("DutyRate")
    @Expose
    private Integer dutyRate;
    @SerializedName("SupplyTaxCode")
    @Expose
    private String supplyTaxCode;
    @SerializedName("PurchaseTaxCode")
    @Expose
    private String purchaseTaxCode;
    @SerializedName("LeadTime")
    @Expose
    private String leadTime;
    @SerializedName("ImageFileName")
    @Expose
    private String imageFileName;
    @SerializedName("FurtherDescription")
    @Expose
    private String furtherDescription;
    @SerializedName("IsStockControl")
    @Expose
    private Boolean isStockControl;
    @SerializedName("IsBackOrderControl")
    @Expose
    private Boolean isBackOrderControl;
    @SerializedName("IsAutoUOMConversion")
    @Expose
    private Boolean isAutoUOMConversion;
    @SerializedName("CostingMethod")
    @Expose
    private Integer costingMethod;
    @SerializedName("PurchaseTaxRate")
    @Expose
    private Integer purchaseTaxRate;
    @SerializedName("SupplyTaxRate")
    @Expose
    private Integer supplyTaxRate;
    @SerializedName("TariffCode")
    @Expose
    private String tariffCode;
    private final static long serialVersionUID = 6131521610876271391L;

    /**
     * No args constructor for use in serialization
     */
    public CLProductDto() {
    }

    /**
     * @param itemType
     * @param tariffCode
     * @param itemCode
     * @param leadTime
     * @param isActive
     * @param reportUOM
     * @param furtherDescription
     * @param uom
     * @param salesUOM
     * @param isAutoUOMConversion
     * @param isStockControl
     * @param id
     * @param itemDescription
     * @param supplyTaxCode
     * @param supplyTaxRate
     * @param itemGroup
     * @param purchaseTaxRate
     * @param costingMethod
     * @param dutyRate
     * @param discontinued
     * @param purchaseUOM
     * @param baseUOM
     * @param purchaseTaxCode
     * @param imageFileName
     * @param itemDescription2
     * @param isBackOrderControl
     */
    public CLProductDto(String id, String itemCode, String itemDescription, String itemDescription2, String itemGroup, String itemType, String baseUOM, String salesUOM, String purchaseUOM, String reportUOM, List<Uom> uom, Boolean isActive, Boolean discontinued, Integer dutyRate, String supplyTaxCode, String purchaseTaxCode, String leadTime, String imageFileName, String furtherDescription, Boolean isStockControl, Boolean isBackOrderControl, Boolean isAutoUOMConversion, Integer costingMethod, Integer purchaseTaxRate, Integer supplyTaxRate, String tariffCode) {
        super();
        this.id = id;
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemDescription2 = itemDescription2;
        this.itemGroup = itemGroup;
        this.itemType = itemType;
        this.baseUOM = baseUOM;
        this.salesUOM = salesUOM;
        this.purchaseUOM = purchaseUOM;
        this.reportUOM = reportUOM;
        this.uom = uom;
        this.isActive = isActive;
        this.discontinued = discontinued;
        this.dutyRate = dutyRate;
        this.supplyTaxCode = supplyTaxCode;
        this.purchaseTaxCode = purchaseTaxCode;
        this.leadTime = leadTime;
        this.imageFileName = imageFileName;
        this.furtherDescription = furtherDescription;
        this.isStockControl = isStockControl;
        this.isBackOrderControl = isBackOrderControl;
        this.isAutoUOMConversion = isAutoUOMConversion;
        this.costingMethod = costingMethod;
        this.purchaseTaxRate = purchaseTaxRate;
        this.supplyTaxRate = supplyTaxRate;
        this.tariffCode = tariffCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemDescription2() {
        return itemDescription2;
    }

    public void setItemDescription2(String itemDescription2) {
        this.itemDescription2 = itemDescription2;
    }

    public String getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(String itemGroup) {
        this.itemGroup = itemGroup;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getBaseUOM() {
        return baseUOM;
    }

    public void setBaseUOM(String baseUOM) {
        this.baseUOM = baseUOM;
    }

    public String getSalesUOM() {
        return salesUOM;
    }

    public void setSalesUOM(String salesUOM) {
        this.salesUOM = salesUOM;
    }

    public String getPurchaseUOM() {
        return purchaseUOM;
    }

    public void setPurchaseUOM(String purchaseUOM) {
        this.purchaseUOM = purchaseUOM;
    }

    public String getReportUOM() {
        return reportUOM;
    }

    public void setReportUOM(String reportUOM) {
        this.reportUOM = reportUOM;
    }

    public List<Uom> getUom() {
        return uom;
    }

    public void setUom(List<Uom> uom) {
        this.uom = uom;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Integer getDutyRate() {
        return dutyRate;
    }

    public void setDutyRate(Integer dutyRate) {
        this.dutyRate = dutyRate;
    }

    public String getSupplyTaxCode() {
        return supplyTaxCode;
    }

    public void setSupplyTaxCode(String supplyTaxCode) {
        this.supplyTaxCode = supplyTaxCode;
    }

    public String getPurchaseTaxCode() {
        return purchaseTaxCode;
    }

    public void setPurchaseTaxCode(String purchaseTaxCode) {
        this.purchaseTaxCode = purchaseTaxCode;
    }

    public String getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(String leadTime) {
        this.leadTime = leadTime;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getFurtherDescription() {
        return furtherDescription;
    }

    public void setFurtherDescription(String furtherDescription) {
        this.furtherDescription = furtherDescription;
    }

    public Boolean getIsStockControl() {
        return isStockControl;
    }

    public void setIsStockControl(Boolean isStockControl) {
        this.isStockControl = isStockControl;
    }

    public Boolean getIsBackOrderControl() {
        return isBackOrderControl;
    }

    public void setIsBackOrderControl(Boolean isBackOrderControl) {
        this.isBackOrderControl = isBackOrderControl;
    }

    public Boolean getIsAutoUOMConversion() {
        return isAutoUOMConversion;
    }

    public void setIsAutoUOMConversion(Boolean isAutoUOMConversion) {
        this.isAutoUOMConversion = isAutoUOMConversion;
    }

    public Integer getCostingMethod() {
        return costingMethod;
    }

    public void setCostingMethod(Integer costingMethod) {
        this.costingMethod = costingMethod;
    }

    public Integer getPurchaseTaxRate() {
        return purchaseTaxRate;
    }

    public void setPurchaseTaxRate(Integer purchaseTaxRate) {
        this.purchaseTaxRate = purchaseTaxRate;
    }

    public Integer getSupplyTaxRate() {
        return supplyTaxRate;
    }

    public void setSupplyTaxRate(Integer supplyTaxRate) {
        this.supplyTaxRate = supplyTaxRate;
    }

    public String getTariffCode() {
        return tariffCode;
    }

    public void setTariffCode(String tariffCode) {
        this.tariffCode = tariffCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLProductDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("itemCode");
        sb.append('=');
        sb.append(((this.itemCode == null) ? "<null>" : this.itemCode));
        sb.append(',');
        sb.append("itemDescription");
        sb.append('=');
        sb.append(((this.itemDescription == null) ? "<null>" : this.itemDescription));
        sb.append(',');
        sb.append("itemDescription2");
        sb.append('=');
        sb.append(((this.itemDescription2 == null) ? "<null>" : this.itemDescription2));
        sb.append(',');
        sb.append("itemGroup");
        sb.append('=');
        sb.append(((this.itemGroup == null) ? "<null>" : this.itemGroup));
        sb.append(',');
        sb.append("itemType");
        sb.append('=');
        sb.append(((this.itemType == null) ? "<null>" : this.itemType));
        sb.append(',');
        sb.append("baseUOM");
        sb.append('=');
        sb.append(((this.baseUOM == null) ? "<null>" : this.baseUOM));
        sb.append(',');
        sb.append("salesUOM");
        sb.append('=');
        sb.append(((this.salesUOM == null) ? "<null>" : this.salesUOM));
        sb.append(',');
        sb.append("purchaseUOM");
        sb.append('=');
        sb.append(((this.purchaseUOM == null) ? "<null>" : this.purchaseUOM));
        sb.append(',');
        sb.append("reportUOM");
        sb.append('=');
        sb.append(((this.reportUOM == null) ? "<null>" : this.reportUOM));
        sb.append(',');
        sb.append("uom");
        sb.append('=');
        sb.append(((this.uom == null) ? "<null>" : this.uom));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null) ? "<null>" : this.isActive));
        sb.append(',');
        sb.append("discontinued");
        sb.append('=');
        sb.append(((this.discontinued == null) ? "<null>" : this.discontinued));
        sb.append(',');
        sb.append("dutyRate");
        sb.append('=');
        sb.append(((this.dutyRate == null) ? "<null>" : this.dutyRate));
        sb.append(',');
        sb.append("supplyTaxCode");
        sb.append('=');
        sb.append(((this.supplyTaxCode == null) ? "<null>" : this.supplyTaxCode));
        sb.append(',');
        sb.append("purchaseTaxCode");
        sb.append('=');
        sb.append(((this.purchaseTaxCode == null) ? "<null>" : this.purchaseTaxCode));
        sb.append(',');
        sb.append("leadTime");
        sb.append('=');
        sb.append(((this.leadTime == null) ? "<null>" : this.leadTime));
        sb.append(',');
        sb.append("imageFileName");
        sb.append('=');
        sb.append(((this.imageFileName == null) ? "<null>" : this.imageFileName));
        sb.append(',');
        sb.append("furtherDescription");
        sb.append('=');
        sb.append(((this.furtherDescription == null) ? "<null>" : this.furtherDescription));
        sb.append(',');
        sb.append("isStockControl");
        sb.append('=');
        sb.append(((this.isStockControl == null) ? "<null>" : this.isStockControl));
        sb.append(',');
        sb.append("isBackOrderControl");
        sb.append('=');
        sb.append(((this.isBackOrderControl == null) ? "<null>" : this.isBackOrderControl));
        sb.append(',');
        sb.append("isAutoUOMConversion");
        sb.append('=');
        sb.append(((this.isAutoUOMConversion == null) ? "<null>" : this.isAutoUOMConversion));
        sb.append(',');
        sb.append("costingMethod");
        sb.append('=');
        sb.append(((this.costingMethod == null) ? "<null>" : this.costingMethod));
        sb.append(',');
        sb.append("purchaseTaxRate");
        sb.append('=');
        sb.append(((this.purchaseTaxRate == null) ? "<null>" : this.purchaseTaxRate));
        sb.append(',');
        sb.append("supplyTaxRate");
        sb.append('=');
        sb.append(((this.supplyTaxRate == null) ? "<null>" : this.supplyTaxRate));
        sb.append(',');
        sb.append("tariffCode");
        sb.append('=');
        sb.append(((this.tariffCode == null) ? "<null>" : this.tariffCode));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
