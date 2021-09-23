
package com.crm.aotg.integration.account.dto;

import java.io.Serializable;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Attributes implements Serializable {

    @SerializedName("Account")
    @Expose
    private String account;
    private final static long serialVersionUID = 5904383805690336732L;

    /**
     * No args constructor for use in serialization
     */
    public Attributes() {
    }

    /**
     * @param account
     */
    public Attributes(String account) {
        super();
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null) ? "<null>" : this.account));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
