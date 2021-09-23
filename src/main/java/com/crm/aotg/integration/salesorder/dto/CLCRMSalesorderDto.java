
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.crm.aotg.integration.common.dto.CLError;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CLCRMSalesorderDto implements Serializable {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("records")
    @Expose
    private List<Record> records = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("errors")
    @Expose
    private CLError errors;
    private final static long serialVersionUID = 2588850452400209915L;

    /**
     * No args constructor for use in serialization
     */
    public CLCRMSalesorderDto() {
    }

    /**
     * @param records
     * @param count
     * @param message
     * @param errors
     * @param status
     */
    public CLCRMSalesorderDto(Integer count, List<Record> records, String message, Integer status, CLError errors) {
        super();
        this.count = count;
        this.records = records;
        this.message = message;
        this.status = status;
        this.errors = errors;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(CLError errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLCRMSalesorderDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null) ? "<null>" : this.count));
        sb.append(',');
        sb.append("records");
        sb.append('=');
        sb.append(((this.records == null) ? "<null>" : this.records));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null) ? "<null>" : this.message));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null) ? "<null>" : this.status));
        sb.append(',');
        sb.append("errors");
        sb.append('=');
        sb.append(((this.errors == null) ? "<null>" : this.errors));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
