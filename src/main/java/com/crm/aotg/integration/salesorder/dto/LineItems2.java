
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LineItems2 implements Serializable {

    @SerializedName("BodyId")
    @Expose
    private String bodyId;
    @SerializedName("Attachment")
    @Expose
    private Attachment attachment;
    @SerializedName("PaymentDate")
    @Expose
    private String paymentDate;
    @SerializedName("PaymentAmount")
    @Expose
    private String paymentAmount;
    private final static long serialVersionUID = 5919683624572407213L;

    /**
     * No args constructor for use in serialization
     */
    public LineItems2() {
    }

    /**
     * @param attachment
     * @param bodyId
     * @param paymentDate
     * @param paymentAmount
     */
    public LineItems2(String bodyId, Attachment attachment, String paymentDate, String paymentAmount) {
        super();
        this.bodyId = bodyId;
        this.attachment = attachment;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public String getBodyId() {
        return bodyId;
    }

    public void setBodyId(String bodyId) {
        this.bodyId = bodyId;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineItems2.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bodyId");
        sb.append('=');
        sb.append(((this.bodyId == null) ? "<null>" : this.bodyId));
        sb.append(',');
        sb.append("attachment");
        sb.append('=');
        sb.append(((this.attachment == null) ? "<null>" : this.attachment));
        sb.append(',');
        sb.append("paymentDate");
        sb.append('=');
        sb.append(((this.paymentDate == null) ? "<null>" : this.paymentDate));
        sb.append(',');
        sb.append("paymentAmount");
        sb.append('=');
        sb.append(((this.paymentAmount == null) ? "<null>" : this.paymentAmount));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
