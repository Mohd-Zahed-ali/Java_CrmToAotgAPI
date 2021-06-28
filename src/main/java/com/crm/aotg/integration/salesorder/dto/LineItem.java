
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LineItem implements Serializable
{

    @SerializedName("BodyId")
    @Expose
    private String bodyId;
    @SerializedName("ProductCategory__name")
    @Expose
    private String productCategoryName;
    @SerializedName("ProductCategory__id")
    @Expose
    private String productCategoryId;
    @SerializedName("ProductCategory__code")
    @Expose
    private String productCategoryCode;
    @SerializedName("ProductCode")
    @Expose
    private String productCode;
    @SerializedName("UoM__name")
    @Expose
    private String uoMName;
    @SerializedName("UoM__id")
    @Expose
    private String uoMId;
    @SerializedName("UoM__code")
    @Expose
    private String uoMCode;
    @SerializedName("FinalAmount")
    @Expose
    private String finalAmount;
    @SerializedName("ProductId__name")
    @Expose
    private String productIdName;
    @SerializedName("ProductId__id")
    @Expose
    private String productIdId;
    @SerializedName("ProductId__code")
    @Expose
    private String productIdCode;
    @SerializedName("Quantity")
    @Expose
    private String quantity;
    @SerializedName("ProdDescription")
    @Expose
    private String prodDescription;
    @SerializedName("Discount")
    @Expose
    private String discount;
    @SerializedName("SalesPrice")
    @Expose
    private String salesPrice;
    @SerializedName("CreatedBy__name")
    @Expose
    private String createdByName;
    @SerializedName("CreatedBy__id")
    @Expose
    private String createdById;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("Amount")
    @Expose
    private String amount;
    @SerializedName("iAOTGBodyId")
    @Expose
    private String iAOTGBodyId;
    private final static long serialVersionUID = -4423524936498544650L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineItem() {
    }

    /**
     * 
     * @param productCategoryCode
     * @param uoMCode
     * @param createdByName
     * @param amount
     * @param quantity
     * @param productCategoryName
     * @param salesPrice
     * @param discount
     * @param uoMId
     * @param prodDescription
     * @param productCategoryId
     * @param productCode
     * @param createdDate
     * @param finalAmount
     * @param productIdId
     * @param bodyId
     * @param uoMName
     * @param productIdName
     * @param productIdCode
     * @param createdById
     * @param iAOTGBodyId
     */
    public LineItem(String bodyId, String productCategoryName, String productCategoryId, String productCategoryCode, String productCode, String uoMName, String uoMId, String uoMCode, String finalAmount, String productIdName, String productIdId, String productIdCode, String quantity, String prodDescription, String discount, String salesPrice, String createdByName, String createdById, String createdDate, String amount,String iAOTGBodyId) {
        super();
        this.bodyId = bodyId;
        this.productCategoryName = productCategoryName;
        this.productCategoryId = productCategoryId;
        this.productCategoryCode = productCategoryCode;
        this.productCode = productCode;
        this.uoMName = uoMName;
        this.uoMId = uoMId;
        this.uoMCode = uoMCode;
        this.finalAmount = finalAmount;
        this.productIdName = productIdName;
        this.productIdId = productIdId;
        this.productIdCode = productIdCode;
        this.quantity = quantity;
        this.prodDescription = prodDescription;
        this.discount = discount;
        this.salesPrice = salesPrice;
        this.createdByName = createdByName;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.amount = amount;
        this.iAOTGBodyId=iAOTGBodyId;
    }

    public String getBodyId() {
        return bodyId;
    }

    public void setBodyId(String bodyId) {
        this.bodyId = bodyId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryCode() {
        return productCategoryCode;
    }

    public void setProductCategoryCode(String productCategoryCode) {
        this.productCategoryCode = productCategoryCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getUoMName() {
        return uoMName;
    }

    public void setUoMName(String uoMName) {
        this.uoMName = uoMName;
    }

    public String getUoMId() {
        return uoMId;
    }

    public void setUoMId(String uoMId) {
        this.uoMId = uoMId;
    }

    public String getUoMCode() {
        return uoMCode;
    }

    public void setUoMCode(String uoMCode) {
        this.uoMCode = uoMCode;
    }

    public String getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(String finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getProductIdName() {
        return productIdName;
    }

    public void setProductIdName(String productIdName) {
        this.productIdName = productIdName;
    }

    public String getProductIdId() {
        return productIdId;
    }

    public void setProductIdId(String productIdId) {
        this.productIdId = productIdId;
    }

    public String getProductIdCode() {
        return productIdCode;
    }

    public void setProductIdCode(String productIdCode) {
        this.productIdCode = productIdCode;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(String salesPrice) {
        this.salesPrice = salesPrice;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public  String getIAOTGBodyId() {return  iAOTGBodyId; }

    public void setiAOTGBodyId(String iAOTGBodyId){ this.iAOTGBodyId = iAOTGBodyId;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bodyId");
        sb.append('=');
        sb.append(((this.bodyId == null)?"<null>":this.bodyId));
        sb.append(',');
        sb.append("productCategoryName");
        sb.append('=');
        sb.append(((this.productCategoryName == null)?"<null>":this.productCategoryName));
        sb.append(',');
        sb.append("productCategoryId");
        sb.append('=');
        sb.append(((this.productCategoryId == null)?"<null>":this.productCategoryId));
        sb.append(',');
        sb.append("productCategoryCode");
        sb.append('=');
        sb.append(((this.productCategoryCode == null)?"<null>":this.productCategoryCode));
        sb.append(',');
        sb.append("productCode");
        sb.append('=');
        sb.append(((this.productCode == null)?"<null>":this.productCode));
        sb.append(',');
        sb.append("uoMName");
        sb.append('=');
        sb.append(((this.uoMName == null)?"<null>":this.uoMName));
        sb.append(',');
        sb.append("uoMId");
        sb.append('=');
        sb.append(((this.uoMId == null)?"<null>":this.uoMId));
        sb.append(',');
        sb.append("uoMCode");
        sb.append('=');
        sb.append(((this.uoMCode == null)?"<null>":this.uoMCode));
        sb.append(',');
        sb.append("finalAmount");
        sb.append('=');
        sb.append(((this.finalAmount == null)?"<null>":this.finalAmount));
        sb.append(',');
        sb.append("productIdName");
        sb.append('=');
        sb.append(((this.productIdName == null)?"<null>":this.productIdName));
        sb.append(',');
        sb.append("productIdId");
        sb.append('=');
        sb.append(((this.productIdId == null)?"<null>":this.productIdId));
        sb.append(',');
        sb.append("productIdCode");
        sb.append('=');
        sb.append(((this.productIdCode == null)?"<null>":this.productIdCode));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("prodDescription");
        sb.append('=');
        sb.append(((this.prodDescription == null)?"<null>":this.prodDescription));
        sb.append(',');
        sb.append("discount");
        sb.append('=');
        sb.append(((this.discount == null)?"<null>":this.discount));
        sb.append(',');
        sb.append("salesPrice");
        sb.append('=');
        sb.append(((this.salesPrice == null)?"<null>":this.salesPrice));
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
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("iaootgId");
        sb.append('=');
        sb.append(((this.iAOTGBodyId == null)?"<null>":this.iAOTGBodyId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
