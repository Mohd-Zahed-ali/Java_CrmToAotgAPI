
package com.crm.aotg.integration.product.dto;

import java.io.Serializable;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Record implements Serializable {

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
    @SerializedName("ProductType")
    @Expose
    private String productType;
    @SerializedName("ReorderLevel")
    @Expose
    private String reorderLevel;
    @SerializedName("BinCapacity")
    @Expose
    private String binCapacity;
    @SerializedName("ValuationMethod")
    @Expose
    private String valuationMethod;
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
    @SerializedName("ProductMake")
    @Expose
    private String productMake;
    @SerializedName("ExpiredDate")
    @Expose
    private String expiredDate;
    @SerializedName("WarrantyDays")
    @Expose
    private String warrantyDays;
    @SerializedName("ProductGroup__name")
    @Expose
    private String productGroupName;
    @SerializedName("ProductGroup__id")
    @Expose
    private String productGroupId;
    @SerializedName("ProductGroup__code")
    @Expose
    private String productGroupCode;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("GuaranteeDays")
    @Expose
    private String guaranteeDays;
    @SerializedName("AssignedTo__name")
    @Expose
    private String assignedToName;
    @SerializedName("AssignedTo__id")
    @Expose
    private String assignedToId;
    @SerializedName("IsRead")
    @Expose
    private String isRead;
    @SerializedName("BaseCeilingPrice")
    @Expose
    private String baseCeilingPrice;
    @SerializedName("FactoryCode")
    @Expose
    private String factoryCode;
    @SerializedName("UoM__name")
    @Expose
    private String uoMName;
    @SerializedName("UoM__id")
    @Expose
    private String uoMId;
    @SerializedName("UoM__code")
    @Expose
    private String uoMCode;
    @SerializedName("ProductDescription")
    @Expose
    private String productDescription;
    @SerializedName("OtherDescription")
    @Expose
    private String otherDescription;
    @SerializedName("Grouping")
    @Expose
    private String grouping;
    @SerializedName("ProductTypeNew")
    @Expose
    private String productTypeNew;
    @SerializedName("ProductSubType")
    @Expose
    private String productSubType;
    @SerializedName("ProductCategory__name")
    @Expose
    private String productCategoryName;
    @SerializedName("ProductCategory__id")
    @Expose
    private String productCategoryId;
    @SerializedName("ProductCategory__code")
    @Expose
    private String productCategoryCode;
    @SerializedName("Image1")
    @Expose
    private Image1 image1;
    @SerializedName("Image2")
    @Expose
    private Image2 image2;
    @SerializedName("Image3")
    @Expose
    private Image3 image3;
    @SerializedName("Image4")
    @Expose
    private Image4 image4;
    @SerializedName("AOTGPosting")
    @Expose
    private String aOTGPosting;
    @SerializedName("fMinSellingPrice")
    @Expose
    private String fMinSellingPrice;
    @SerializedName("fMaxSellingPrice")
    @Expose
    private String fMaxSellingPrice;
    @SerializedName("fMinPurchasePrice")
    @Expose
    private String fMinPurchasePrice;
    @SerializedName("fMaxPurchasePrice")
    @Expose
    private String fMaxPurchasePrice;
    @SerializedName("iMinQty")
    @Expose
    private String iMinQty;
    @SerializedName("iMaxQty")
    @Expose
    private String iMaxQty;
    @SerializedName("AutoCoundId")
    @Expose
    private String autoCoundId;
    @SerializedName("DefaultBaseUnit__name")
    @Expose
    private String defaultBaseUnitName;
    @SerializedName("DefaultBaseUnit__id")
    @Expose
    private String defaultBaseUnitId;
    @SerializedName("DefaultBaseUnit__code")
    @Expose
    private String defaultBaseUnitCode;
    private final static long serialVersionUID = -1540624837561701321L;

    /**
     * No args constructor for use in serialization
     */
    public Record() {
    }

    /**
     * @param factoryCode
     * @param uoMCode
     * @param createdByName
     * @param binCapacity
     * @param iMinQty
     * @param expiredDate
     * @param productCategoryName
     * @param productGroupId
     * @param productSubType
     * @param reorderLevel
     * @param productGroupCode
     * @param modifiedById
     * @param warrantyDays
     * @param iMaxQty
     * @param uoMName
     * @param valuationMethod
     * @param createdById
     * @param productDescription
     * @param defaultBaseUnitName
     * @param productCategoryCode
     * @param fMinPurchasePrice
     * @param aOTGPosting
     * @param productGroupName
     * @param grouping
     * @param guaranteeDays
     * @param name
     * @param modifiedDate
     * @param productTypeNew
     * @param isGroup
     * @param fMinSellingPrice
     * @param assignedToId
     * @param fMaxPurchasePrice
     * @param code
     * @param assignedToName
     * @param isRead
     * @param description
     * @param uoMId
     * @param baseCeilingPrice
     * @param modifiedByName
     * @param productCategoryId
     * @param productType
     * @param image3
     * @param image4
     * @param autoCoundId
     * @param defaultBaseUnitId
     * @param productMake
     * @param image1
     * @param image2
     * @param masterId
     * @param createdDate
     * @param defaultBaseUnitCode
     * @param attributes
     * @param otherDescription
     * @param fMaxSellingPrice
     */
    public Record(Attributes attributes, String masterId, String name, String code, String productType, String reorderLevel, String binCapacity, String valuationMethod, String isGroup, String createdByName, String createdById, String modifiedByName, String modifiedById, String createdDate, String modifiedDate, String productMake, String expiredDate, String warrantyDays, String productGroupName, String productGroupId, String productGroupCode, String description, String guaranteeDays, String assignedToName, String assignedToId, String isRead, String baseCeilingPrice, String factoryCode, String uoMName, String uoMId, String uoMCode, String productDescription, String otherDescription, String grouping, String productTypeNew, String productSubType, String productCategoryName, String productCategoryId, String productCategoryCode, Image1 image1, Image2 image2, Image3 image3, Image4 image4, String aOTGPosting, String fMinSellingPrice, String fMaxSellingPrice, String fMinPurchasePrice, String fMaxPurchasePrice, String iMinQty, String iMaxQty, String autoCoundId, String defaultBaseUnitName, String defaultBaseUnitId, String defaultBaseUnitCode) {
        super();
        this.attributes = attributes;
        this.masterId = masterId;
        this.name = name;
        this.code = code;
        this.productType = productType;
        this.reorderLevel = reorderLevel;
        this.binCapacity = binCapacity;
        this.valuationMethod = valuationMethod;
        this.isGroup = isGroup;
        this.createdByName = createdByName;
        this.createdById = createdById;
        this.modifiedByName = modifiedByName;
        this.modifiedById = modifiedById;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.productMake = productMake;
        this.expiredDate = expiredDate;
        this.warrantyDays = warrantyDays;
        this.productGroupName = productGroupName;
        this.productGroupId = productGroupId;
        this.productGroupCode = productGroupCode;
        this.description = description;
        this.guaranteeDays = guaranteeDays;
        this.assignedToName = assignedToName;
        this.assignedToId = assignedToId;
        this.isRead = isRead;
        this.baseCeilingPrice = baseCeilingPrice;
        this.factoryCode = factoryCode;
        this.uoMName = uoMName;
        this.uoMId = uoMId;
        this.uoMCode = uoMCode;
        this.productDescription = productDescription;
        this.otherDescription = otherDescription;
        this.grouping = grouping;
        this.productTypeNew = productTypeNew;
        this.productSubType = productSubType;
        this.productCategoryName = productCategoryName;
        this.productCategoryId = productCategoryId;
        this.productCategoryCode = productCategoryCode;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.aOTGPosting = aOTGPosting;
        this.fMinSellingPrice = fMinSellingPrice;
        this.fMaxSellingPrice = fMaxSellingPrice;
        this.fMinPurchasePrice = fMinPurchasePrice;
        this.fMaxPurchasePrice = fMaxPurchasePrice;
        this.iMinQty = iMinQty;
        this.iMaxQty = iMaxQty;
        this.autoCoundId = autoCoundId;
        this.defaultBaseUnitName = defaultBaseUnitName;
        this.defaultBaseUnitId = defaultBaseUnitId;
        this.defaultBaseUnitCode = defaultBaseUnitCode;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(String reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public String getBinCapacity() {
        return binCapacity;
    }

    public void setBinCapacity(String binCapacity) {
        this.binCapacity = binCapacity;
    }

    public String getValuationMethod() {
        return valuationMethod;
    }

    public void setValuationMethod(String valuationMethod) {
        this.valuationMethod = valuationMethod;
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

    public String getProductMake() {
        return productMake;
    }

    public void setProductMake(String productMake) {
        this.productMake = productMake;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getWarrantyDays() {
        return warrantyDays;
    }

    public void setWarrantyDays(String warrantyDays) {
        this.warrantyDays = warrantyDays;
    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getProductGroupCode() {
        return productGroupCode;
    }

    public void setProductGroupCode(String productGroupCode) {
        this.productGroupCode = productGroupCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGuaranteeDays() {
        return guaranteeDays;
    }

    public void setGuaranteeDays(String guaranteeDays) {
        this.guaranteeDays = guaranteeDays;
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

    public String getBaseCeilingPrice() {
        return baseCeilingPrice;
    }

    public void setBaseCeilingPrice(String baseCeilingPrice) {
        this.baseCeilingPrice = baseCeilingPrice;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
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

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public String getProductTypeNew() {
        return productTypeNew;
    }

    public void setProductTypeNew(String productTypeNew) {
        this.productTypeNew = productTypeNew;
    }

    public String getProductSubType() {
        return productSubType;
    }

    public void setProductSubType(String productSubType) {
        this.productSubType = productSubType;
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

    public Image1 getImage1() {
        return image1;
    }

    public void setImage1(Image1 image1) {
        this.image1 = image1;
    }

    public Image2 getImage2() {
        return image2;
    }

    public void setImage2(Image2 image2) {
        this.image2 = image2;
    }

    public Image3 getImage3() {
        return image3;
    }

    public void setImage3(Image3 image3) {
        this.image3 = image3;
    }

    public Image4 getImage4() {
        return image4;
    }

    public void setImage4(Image4 image4) {
        this.image4 = image4;
    }

    public String getAOTGPosting() {
        return aOTGPosting;
    }

    public void setAOTGPosting(String aOTGPosting) {
        this.aOTGPosting = aOTGPosting;
    }

    public String getfMinSellingPrice() {
        return fMinSellingPrice;
    }

    public void setfMinSellingPrice(String fMinSellingPrice) {
        this.fMinSellingPrice = fMinSellingPrice;
    }

    public String getfMaxSellingPrice() {
        return fMaxSellingPrice;
    }

    public void setfMaxSellingPrice(String fMaxSellingPrice) {
        this.fMaxSellingPrice = fMaxSellingPrice;
    }

    public String getfMinPurchasePrice() {
        return fMinPurchasePrice;
    }

    public void setfMinPurchasePrice(String fMinPurchasePrice) {
        this.fMinPurchasePrice = fMinPurchasePrice;
    }

    public String getfMaxPurchasePrice() {
        return fMaxPurchasePrice;
    }

    public void setfMaxPurchasePrice(String fMaxPurchasePrice) {
        this.fMaxPurchasePrice = fMaxPurchasePrice;
    }

    public String getiMinQty() {
        return iMinQty;
    }

    public void setiMinQty(String iMinQty) {
        this.iMinQty = iMinQty;
    }

    public String getiMaxQty() {
        return iMaxQty;
    }

    public void setiMaxQty(String iMaxQty) {
        this.iMaxQty = iMaxQty;
    }

    public String getAutoCoundId() {
        return autoCoundId;
    }

    public void setAutoCoundId(String autoCoundId) {
        this.autoCoundId = autoCoundId;
    }

    public String getDefaultBaseUnitName() {
        return defaultBaseUnitName;
    }

    public void setDefaultBaseUnitName(String defaultBaseUnitName) {
        this.defaultBaseUnitName = defaultBaseUnitName;
    }

    public String getDefaultBaseUnitId() {
        return defaultBaseUnitId;
    }

    public void setDefaultBaseUnitId(String defaultBaseUnitId) {
        this.defaultBaseUnitId = defaultBaseUnitId;
    }

    public String getDefaultBaseUnitCode() {
        return defaultBaseUnitCode;
    }

    public void setDefaultBaseUnitCode(String defaultBaseUnitCode) {
        this.defaultBaseUnitCode = defaultBaseUnitCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Record.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null) ? "<null>" : this.attributes));
        sb.append(',');
        sb.append("masterId");
        sb.append('=');
        sb.append(((this.masterId == null) ? "<null>" : this.masterId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null) ? "<null>" : this.code));
        sb.append(',');
        sb.append("productType");
        sb.append('=');
        sb.append(((this.productType == null) ? "<null>" : this.productType));
        sb.append(',');
        sb.append("reorderLevel");
        sb.append('=');
        sb.append(((this.reorderLevel == null) ? "<null>" : this.reorderLevel));
        sb.append(',');
        sb.append("binCapacity");
        sb.append('=');
        sb.append(((this.binCapacity == null) ? "<null>" : this.binCapacity));
        sb.append(',');
        sb.append("valuationMethod");
        sb.append('=');
        sb.append(((this.valuationMethod == null) ? "<null>" : this.valuationMethod));
        sb.append(',');
        sb.append("isGroup");
        sb.append('=');
        sb.append(((this.isGroup == null) ? "<null>" : this.isGroup));
        sb.append(',');
        sb.append("createdByName");
        sb.append('=');
        sb.append(((this.createdByName == null) ? "<null>" : this.createdByName));
        sb.append(',');
        sb.append("createdById");
        sb.append('=');
        sb.append(((this.createdById == null) ? "<null>" : this.createdById));
        sb.append(',');
        sb.append("modifiedByName");
        sb.append('=');
        sb.append(((this.modifiedByName == null) ? "<null>" : this.modifiedByName));
        sb.append(',');
        sb.append("modifiedById");
        sb.append('=');
        sb.append(((this.modifiedById == null) ? "<null>" : this.modifiedById));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null) ? "<null>" : this.createdDate));
        sb.append(',');
        sb.append("modifiedDate");
        sb.append('=');
        sb.append(((this.modifiedDate == null) ? "<null>" : this.modifiedDate));
        sb.append(',');
        sb.append("productMake");
        sb.append('=');
        sb.append(((this.productMake == null) ? "<null>" : this.productMake));
        sb.append(',');
        sb.append("expiredDate");
        sb.append('=');
        sb.append(((this.expiredDate == null) ? "<null>" : this.expiredDate));
        sb.append(',');
        sb.append("warrantyDays");
        sb.append('=');
        sb.append(((this.warrantyDays == null) ? "<null>" : this.warrantyDays));
        sb.append(',');
        sb.append("productGroupName");
        sb.append('=');
        sb.append(((this.productGroupName == null) ? "<null>" : this.productGroupName));
        sb.append(',');
        sb.append("productGroupId");
        sb.append('=');
        sb.append(((this.productGroupId == null) ? "<null>" : this.productGroupId));
        sb.append(',');
        sb.append("productGroupCode");
        sb.append('=');
        sb.append(((this.productGroupCode == null) ? "<null>" : this.productGroupCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("guaranteeDays");
        sb.append('=');
        sb.append(((this.guaranteeDays == null) ? "<null>" : this.guaranteeDays));
        sb.append(',');
        sb.append("assignedToName");
        sb.append('=');
        sb.append(((this.assignedToName == null) ? "<null>" : this.assignedToName));
        sb.append(',');
        sb.append("assignedToId");
        sb.append('=');
        sb.append(((this.assignedToId == null) ? "<null>" : this.assignedToId));
        sb.append(',');
        sb.append("isRead");
        sb.append('=');
        sb.append(((this.isRead == null) ? "<null>" : this.isRead));
        sb.append(',');
        sb.append("baseCeilingPrice");
        sb.append('=');
        sb.append(((this.baseCeilingPrice == null) ? "<null>" : this.baseCeilingPrice));
        sb.append(',');
        sb.append("factoryCode");
        sb.append('=');
        sb.append(((this.factoryCode == null) ? "<null>" : this.factoryCode));
        sb.append(',');
        sb.append("uoMName");
        sb.append('=');
        sb.append(((this.uoMName == null) ? "<null>" : this.uoMName));
        sb.append(',');
        sb.append("uoMId");
        sb.append('=');
        sb.append(((this.uoMId == null) ? "<null>" : this.uoMId));
        sb.append(',');
        sb.append("uoMCode");
        sb.append('=');
        sb.append(((this.uoMCode == null) ? "<null>" : this.uoMCode));
        sb.append(',');
        sb.append("productDescription");
        sb.append('=');
        sb.append(((this.productDescription == null) ? "<null>" : this.productDescription));
        sb.append(',');
        sb.append("otherDescription");
        sb.append('=');
        sb.append(((this.otherDescription == null) ? "<null>" : this.otherDescription));
        sb.append(',');
        sb.append("grouping");
        sb.append('=');
        sb.append(((this.grouping == null) ? "<null>" : this.grouping));
        sb.append(',');
        sb.append("productTypeNew");
        sb.append('=');
        sb.append(((this.productTypeNew == null) ? "<null>" : this.productTypeNew));
        sb.append(',');
        sb.append("productSubType");
        sb.append('=');
        sb.append(((this.productSubType == null) ? "<null>" : this.productSubType));
        sb.append(',');
        sb.append("productCategoryName");
        sb.append('=');
        sb.append(((this.productCategoryName == null) ? "<null>" : this.productCategoryName));
        sb.append(',');
        sb.append("productCategoryId");
        sb.append('=');
        sb.append(((this.productCategoryId == null) ? "<null>" : this.productCategoryId));
        sb.append(',');
        sb.append("productCategoryCode");
        sb.append('=');
        sb.append(((this.productCategoryCode == null) ? "<null>" : this.productCategoryCode));
        sb.append(',');
        sb.append("image1");
        sb.append('=');
        sb.append(((this.image1 == null) ? "<null>" : this.image1));
        sb.append(',');
        sb.append("image2");
        sb.append('=');
        sb.append(((this.image2 == null) ? "<null>" : this.image2));
        sb.append(',');
        sb.append("image3");
        sb.append('=');
        sb.append(((this.image3 == null) ? "<null>" : this.image3));
        sb.append(',');
        sb.append("image4");
        sb.append('=');
        sb.append(((this.image4 == null) ? "<null>" : this.image4));
        sb.append(',');
        sb.append("aOTGPosting");
        sb.append('=');
        sb.append(((this.aOTGPosting == null) ? "<null>" : this.aOTGPosting));
        sb.append(',');
        sb.append("fMinSellingPrice");
        sb.append('=');
        sb.append(((this.fMinSellingPrice == null) ? "<null>" : this.fMinSellingPrice));
        sb.append(',');
        sb.append("fMaxSellingPrice");
        sb.append('=');
        sb.append(((this.fMaxSellingPrice == null) ? "<null>" : this.fMaxSellingPrice));
        sb.append(',');
        sb.append("fMinPurchasePrice");
        sb.append('=');
        sb.append(((this.fMinPurchasePrice == null) ? "<null>" : this.fMinPurchasePrice));
        sb.append(',');
        sb.append("fMaxPurchasePrice");
        sb.append('=');
        sb.append(((this.fMaxPurchasePrice == null) ? "<null>" : this.fMaxPurchasePrice));
        sb.append(',');
        sb.append("iMinQty");
        sb.append('=');
        sb.append(((this.iMinQty == null) ? "<null>" : this.iMinQty));
        sb.append(',');
        sb.append("iMaxQty");
        sb.append('=');
        sb.append(((this.iMaxQty == null) ? "<null>" : this.iMaxQty));
        sb.append(',');
        sb.append("autoCoundId");
        sb.append('=');
        sb.append(((this.autoCoundId == null) ? "<null>" : this.autoCoundId));
        sb.append(',');
        sb.append("defaultBaseUnitName");
        sb.append('=');
        sb.append(((this.defaultBaseUnitName == null) ? "<null>" : this.defaultBaseUnitName));
        sb.append(',');
        sb.append("defaultBaseUnitId");
        sb.append('=');
        sb.append(((this.defaultBaseUnitId == null) ? "<null>" : this.defaultBaseUnitId));
        sb.append(',');
        sb.append("defaultBaseUnitCode");
        sb.append('=');
        sb.append(((this.defaultBaseUnitCode == null) ? "<null>" : this.defaultBaseUnitCode));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
