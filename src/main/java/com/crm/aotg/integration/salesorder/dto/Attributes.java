
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Attributes implements Serializable
{

    @SerializedName("SalesOrder")
    @Expose
    private String salesOrder;
    private final static long serialVersionUID = 844450243442846130L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param salesOrder
     */
    public Attributes(String salesOrder) {
        super();
        this.salesOrder = salesOrder;
    }

    public String getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(String salesOrder) {
        this.salesOrder = salesOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("salesOrder");
        sb.append('=');
        sb.append(((this.salesOrder == null)?"<null>":this.salesOrder));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
