
package com.crm.aotg.integration.product.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Uom implements Serializable
{

    @SerializedName("UOM")
    @Expose
    private String uom;
    @SerializedName("RowState")
    @Expose
    private Integer rowState;
    @SerializedName("Rate")
    @Expose
    private Double rate;
    @SerializedName("Price")
    @Expose
    private Double price;
    @SerializedName("StdCost")
    @Expose
    private Double stdCost;
    @SerializedName("BarCode")
    @Expose
    private String barCode;
    @SerializedName("Shelf")
    @Expose
    private String shelf;
    @SerializedName("Weight")
    @Expose
    private Double weight;
    @SerializedName("WeightUOM")
    @Expose
    private String weightUOM;
    @SerializedName("Volume")
    @Expose
    private Double volume;
    @SerializedName("VolumeUOM")
    @Expose
    private String volumeUOM;
    @SerializedName("MinSellingPrice")
    @Expose
    private Double minSellingPrice;
    @SerializedName("MaxSellingPrice")
    @Expose
    private Double maxSellingPrice;
    @SerializedName("MinPurchasePrice")
    @Expose
    private Double minPurchasePrice;
    @SerializedName("MaxPurchasePrice")
    @Expose
    private Double maxPurchasePrice;
    @SerializedName("MinQty")
    @Expose
    private Double minQty;
    @SerializedName("MaxQty")
    @Expose
    private Double maxQty;
    @SerializedName("ReOrderQty")
    @Expose
    private Double reOrderQty;
    @SerializedName("BalQty")
    @Expose
    private Double balQty;
    @SerializedName("ReOrderLevel")
    @Expose
    private Integer reOrderLevel;
    @SerializedName("NormalLevel")
    @Expose
    private Integer normalLevel;
    private final static long serialVersionUID = -8863331962020121280L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Uom() {
    }

    /**
     * 
     * @param normalLevel
     * @param reOrderLevel
     * @param rowState
     * @param weight
     * @param maxSellingPrice
     * @param minSellingPrice
     * @param balQty
     * @param barCode
     * @param shelf
     * @param stdCost
     * @param volume
     * @param uom
     * @param rate
     * @param price
     * @param reOrderQty
     * @param weightUOM
     * @param maxPurchasePrice
     * @param maxQty
     * @param volumeUOM
     * @param minPurchasePrice
     * @param minQty
     */
    public Uom(String uom, Integer rowState, Double rate, Double price, Double stdCost, String barCode, String shelf, Double weight, String weightUOM, Double volume, String volumeUOM, Double minSellingPrice, Double maxSellingPrice, Double minPurchasePrice, Double maxPurchasePrice, Double minQty, Double maxQty, Double reOrderQty, Double balQty, Integer reOrderLevel, Integer normalLevel) {
        super();
        this.uom = uom;
        this.rowState = rowState;
        this.rate = rate;
        this.price = price;
        this.stdCost = stdCost;
        this.barCode = barCode;
        this.shelf = shelf;
        this.weight = weight;
        this.weightUOM = weightUOM;
        this.volume = volume;
        this.volumeUOM = volumeUOM;
        this.minSellingPrice = minSellingPrice;
        this.maxSellingPrice = maxSellingPrice;
        this.minPurchasePrice = minPurchasePrice;
        this.maxPurchasePrice = maxPurchasePrice;
        this.minQty = minQty;
        this.maxQty = maxQty;
        this.reOrderQty = reOrderQty;
        this.balQty = balQty;
        this.reOrderLevel = reOrderLevel;
        this.normalLevel = normalLevel;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Integer getRowState() {
        return rowState;
    }

    public void setRowState(Integer rowState) {
        this.rowState = rowState;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getStdCost() {
        return stdCost;
    }

    public void setStdCost(Double stdCost) {
        this.stdCost = stdCost;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getWeightUOM() {
        return weightUOM;
    }

    public void setWeightUOM(String weightUOM) {
        this.weightUOM = weightUOM;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getVolumeUOM() {
        return volumeUOM;
    }

    public void setVolumeUOM(String volumeUOM) {
        this.volumeUOM = volumeUOM;
    }

    public Double getMinSellingPrice() {
        return minSellingPrice;
    }

    public void setMinSellingPrice(Double minSellingPrice) {
        this.minSellingPrice = minSellingPrice;
    }

    public Double getMaxSellingPrice() {
        return maxSellingPrice;
    }

    public void setMaxSellingPrice(Double maxSellingPrice) {
        this.maxSellingPrice = maxSellingPrice;
    }

    public Double getMinPurchasePrice() {
        return minPurchasePrice;
    }

    public void setMinPurchasePrice(Double minPurchasePrice) {
        this.minPurchasePrice = minPurchasePrice;
    }

    public Double getMaxPurchasePrice() {
        return maxPurchasePrice;
    }

    public void setMaxPurchasePrice(Double maxPurchasePrice) {
        this.maxPurchasePrice = maxPurchasePrice;
    }

    public Double getMinQty() {
        return minQty;
    }

    public void setMinQty(Double minQty) {
        this.minQty = minQty;
    }

    public Double getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(Double maxQty) {
        this.maxQty = maxQty;
    }

    public Double getReOrderQty() {
        return reOrderQty;
    }

    public void setReOrderQty(Double reOrderQty) {
        this.reOrderQty = reOrderQty;
    }

    public Double getBalQty() {
        return balQty;
    }

    public void setBalQty(Double balQty) {
        this.balQty = balQty;
    }

    public Integer getReOrderLevel() {
        return reOrderLevel;
    }

    public void setReOrderLevel(Integer reOrderLevel) {
        this.reOrderLevel = reOrderLevel;
    }

    public Integer getNormalLevel() {
        return normalLevel;
    }

    public void setNormalLevel(Integer normalLevel) {
        this.normalLevel = normalLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Uom.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uom");
        sb.append('=');
        sb.append(((this.uom == null)?"<null>":this.uom));
        sb.append(',');
        sb.append("rowState");
        sb.append('=');
        sb.append(((this.rowState == null)?"<null>":this.rowState));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("stdCost");
        sb.append('=');
        sb.append(((this.stdCost == null)?"<null>":this.stdCost));
        sb.append(',');
        sb.append("barCode");
        sb.append('=');
        sb.append(((this.barCode == null)?"<null>":this.barCode));
        sb.append(',');
        sb.append("shelf");
        sb.append('=');
        sb.append(((this.shelf == null)?"<null>":this.shelf));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("weightUOM");
        sb.append('=');
        sb.append(((this.weightUOM == null)?"<null>":this.weightUOM));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("volumeUOM");
        sb.append('=');
        sb.append(((this.volumeUOM == null)?"<null>":this.volumeUOM));
        sb.append(',');
        sb.append("minSellingPrice");
        sb.append('=');
        sb.append(((this.minSellingPrice == null)?"<null>":this.minSellingPrice));
        sb.append(',');
        sb.append("maxSellingPrice");
        sb.append('=');
        sb.append(((this.maxSellingPrice == null)?"<null>":this.maxSellingPrice));
        sb.append(',');
        sb.append("minPurchasePrice");
        sb.append('=');
        sb.append(((this.minPurchasePrice == null)?"<null>":this.minPurchasePrice));
        sb.append(',');
        sb.append("maxPurchasePrice");
        sb.append('=');
        sb.append(((this.maxPurchasePrice == null)?"<null>":this.maxPurchasePrice));
        sb.append(',');
        sb.append("minQty");
        sb.append('=');
        sb.append(((this.minQty == null)?"<null>":this.minQty));
        sb.append(',');
        sb.append("maxQty");
        sb.append('=');
        sb.append(((this.maxQty == null)?"<null>":this.maxQty));
        sb.append(',');
        sb.append("reOrderQty");
        sb.append('=');
        sb.append(((this.reOrderQty == null)?"<null>":this.reOrderQty));
        sb.append(',');
        sb.append("balQty");
        sb.append('=');
        sb.append(((this.balQty == null)?"<null>":this.balQty));
        sb.append(',');
        sb.append("reOrderLevel");
        sb.append('=');
        sb.append(((this.reOrderLevel == null)?"<null>":this.reOrderLevel));
        sb.append(',');
        sb.append("normalLevel");
        sb.append('=');
        sb.append(((this.normalLevel == null)?"<null>":this.normalLevel));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
