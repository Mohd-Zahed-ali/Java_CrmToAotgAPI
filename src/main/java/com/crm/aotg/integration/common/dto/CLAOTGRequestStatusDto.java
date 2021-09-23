package com.crm.aotg.integration.common.dto;

import java.io.Serializable;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CLAOTGRequestStatusDto implements Serializable {

    @SerializedName("RequestId")
    @Expose
    private String requestId;
    @SerializedName("Status")
    @Expose
    private String status;
    private final static long serialVersionUID = -2532037833864994609L;

    /**
     * No args constructor for use in serialization
     */
    public CLAOTGRequestStatusDto() {
    }

    /**
     * @param requestId
     * @param status
     */
    public CLAOTGRequestStatusDto(String requestId, String status) {
        super();
        this.requestId = requestId;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLAOTGRequestStatusDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null) ? "<null>" : this.requestId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null) ? "<null>" : this.status));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}