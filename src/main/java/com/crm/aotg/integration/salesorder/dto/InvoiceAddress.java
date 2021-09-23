
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class InvoiceAddress implements Serializable {

    @SerializedName("Contact")
    @Expose
    private String contact;
    @SerializedName("Fax")
    @Expose
    private String fax;
    @SerializedName("Phone")
    @Expose
    private String phone;
    @SerializedName("Address1")
    @Expose
    private String address1;
    @SerializedName("Address2")
    @Expose
    private String address2;
    @SerializedName("Address3")
    @Expose
    private String address3;
    @SerializedName("Address4")
    @Expose
    private String address4;
    private final static long serialVersionUID = 2735676427373051837L;

    /**
     * No args constructor for use in serialization
     */
    public InvoiceAddress() {
    }

    /**
     * @param address3
     * @param phone
     * @param address2
     * @param address1
     * @param contact
     * @param address4
     * @param fax
     */
    public InvoiceAddress(String contact, String fax, String phone, String address1, String address2, String address3, String address4) {
        super();
        this.contact = contact;
        this.fax = fax;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
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

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("address1");
        sb.append('=');
        sb.append(((this.address1 == null) ? "<null>" : this.address1));
        sb.append(',');
        sb.append("address2");
        sb.append('=');
        sb.append(((this.address2 == null) ? "<null>" : this.address2));
        sb.append(',');
        sb.append("address3");
        sb.append('=');
        sb.append(((this.address3 == null) ? "<null>" : this.address3));
        sb.append(',');
        sb.append("address4");
        sb.append('=');
        sb.append(((this.address4 == null) ? "<null>" : this.address4));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
