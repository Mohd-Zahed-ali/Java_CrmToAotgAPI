package com.crm.aotg.integration.common.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CLAOTGResultDto implements Serializable
{

    @SerializedName("RequestId")
    @Expose
    private String requestId;
    @SerializedName("RequestName")
    @Expose
    private String requestName;
    @SerializedName("HostName")
    @Expose
    private String hostName;
    @SerializedName("IPAddress")
    @Expose
    private String iPAddress;
    @SerializedName("RequestTypeName")
    @Expose
    private String requestTypeName;
    @SerializedName("ResultJson")
    @Expose
    private String resultJson;
    @SerializedName("RequestParamJson")
    @Expose
    private Object requestParamJson;
    @SerializedName("ResultStream")
    @Expose
    private Object resultStream;
    @SerializedName("ResultTypeName")
    @Expose
    private String resultTypeName;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("AccountBookInfo")
    @Expose
    private String accountBookInfo;
    @SerializedName("AccountBookDBInfo")
    @Expose
    private String accountBookDBInfo;
    @SerializedName("Timestamp")
    @Expose
    private String timestamp;
    @SerializedName("ResultedTimestamp")
    @Expose
    private String resultedTimestamp;
    @SerializedName("ProcessingInterval")
    @Expose
    private Float processingInterval;
    @SerializedName("InQueueInterval")
    @Expose
    private Float inQueueInterval;
    @SerializedName("ResultFileURL")
    @Expose
    private Object resultFileURL;
    private final static long serialVersionUID = -3539984768378763388L;

    /**
     * No args constructor for use in serialization
     *
     */
    public CLAOTGResultDto() {
    }

    /**
     *
     * @param resultJson
     * @param hostName
     * @param processingInterval
     * @param accountBookInfo
     * @param inQueueInterval
     * @param requestTypeName
     * @param requestParamJson
     * @param accountBookDBInfo
     * @param resultTypeName
     * @param version
     * @param requestName
     * @param resultedTimestamp
     * @param iPAddress
     * @param resultFileURL
     * @param requestId
     * @param resultStream
     * @param status
     * @param timestamp
     */
    public CLAOTGResultDto(String requestId, String requestName, String hostName, String iPAddress, String requestTypeName, String resultJson, Object requestParamJson, Object resultStream, String resultTypeName, String status, String version, String accountBookInfo, String accountBookDBInfo, String timestamp, String resultedTimestamp, Float processingInterval, Float inQueueInterval, Object resultFileURL) {
        super();
        this.requestId = requestId;
        this.requestName = requestName;
        this.hostName = hostName;
        this.iPAddress = iPAddress;
        this.requestTypeName = requestTypeName;
        this.resultJson = resultJson;
        this.requestParamJson = requestParamJson;
        this.resultStream = resultStream;
        this.resultTypeName = resultTypeName;
        this.status = status;
        this.version = version;
        this.accountBookInfo = accountBookInfo;
        this.accountBookDBInfo = accountBookDBInfo;
        this.timestamp = timestamp;
        this.resultedTimestamp = resultedTimestamp;
        this.processingInterval = processingInterval;
        this.inQueueInterval = inQueueInterval;
        this.resultFileURL = resultFileURL;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIPAddress() {
        return iPAddress;
    }

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    public String getRequestTypeName() {
        return requestTypeName;
    }

    public void setRequestTypeName(String requestTypeName) {
        this.requestTypeName = requestTypeName;
    }

    public String getResultJson() {
        return resultJson;
    }

    public void setResultJson(String resultJson) {
        this.resultJson = resultJson;
    }

    public Object getRequestParamJson() {
        return requestParamJson;
    }

    public void setRequestParamJson(Object requestParamJson) {
        this.requestParamJson = requestParamJson;
    }

    public Object getResultStream() {
        return resultStream;
    }

    public void setResultStream(Object resultStream) {
        this.resultStream = resultStream;
    }

    public String getResultTypeName() {
        return resultTypeName;
    }

    public void setResultTypeName(String resultTypeName) {
        this.resultTypeName = resultTypeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAccountBookInfo() {
        return accountBookInfo;
    }

    public void setAccountBookInfo(String accountBookInfo) {
        this.accountBookInfo = accountBookInfo;
    }

    public String getAccountBookDBInfo() {
        return accountBookDBInfo;
    }

    public void setAccountBookDBInfo(String accountBookDBInfo) {
        this.accountBookDBInfo = accountBookDBInfo;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getResultedTimestamp() {
        return resultedTimestamp;
    }

    public void setResultedTimestamp(String resultedTimestamp) {
        this.resultedTimestamp = resultedTimestamp;
    }

    public Float getProcessingInterval() {
        return processingInterval;
    }

    public void setProcessingInterval(Float processingInterval) {
        this.processingInterval = processingInterval;
    }

    public Float getInQueueInterval() {
        return inQueueInterval;
    }

    public void setInQueueInterval(Float inQueueInterval) {
        this.inQueueInterval = inQueueInterval;
    }

    public Object getResultFileURL() {
        return resultFileURL;
    }

    public void setResultFileURL(Object resultFileURL) {
        this.resultFileURL = resultFileURL;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLAOTGResultDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
        sb.append(',');
        sb.append("requestName");
        sb.append('=');
        sb.append(((this.requestName == null)?"<null>":this.requestName));
        sb.append(',');
        sb.append("hostName");
        sb.append('=');
        sb.append(((this.hostName == null)?"<null>":this.hostName));
        sb.append(',');
        sb.append("iPAddress");
        sb.append('=');
        sb.append(((this.iPAddress == null)?"<null>":this.iPAddress));
        sb.append(',');
        sb.append("requestTypeName");
        sb.append('=');
        sb.append(((this.requestTypeName == null)?"<null>":this.requestTypeName));
        sb.append(',');
        sb.append("resultJson");
        sb.append('=');
        sb.append(((this.resultJson == null)?"<null>":this.resultJson));
        sb.append(',');
        sb.append("requestParamJson");
        sb.append('=');
        sb.append(((this.requestParamJson == null)?"<null>":this.requestParamJson));
        sb.append(',');
        sb.append("resultStream");
        sb.append('=');
        sb.append(((this.resultStream == null)?"<null>":this.resultStream));
        sb.append(',');
        sb.append("resultTypeName");
        sb.append('=');
        sb.append(((this.resultTypeName == null)?"<null>":this.resultTypeName));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("accountBookInfo");
        sb.append('=');
        sb.append(((this.accountBookInfo == null)?"<null>":this.accountBookInfo));
        sb.append(',');
        sb.append("accountBookDBInfo");
        sb.append('=');
        sb.append(((this.accountBookDBInfo == null)?"<null>":this.accountBookDBInfo));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("resultedTimestamp");
        sb.append('=');
        sb.append(((this.resultedTimestamp == null)?"<null>":this.resultedTimestamp));
        sb.append(',');
        sb.append("processingInterval");
        sb.append('=');
        sb.append(((this.processingInterval == null)?"<null>":this.processingInterval));
        sb.append(',');
        sb.append("inQueueInterval");
        sb.append('=');
        sb.append(((this.inQueueInterval == null)?"<null>":this.inQueueInterval));
        sb.append(',');
        sb.append("resultFileURL");
        sb.append('=');
        sb.append(((this.resultFileURL == null)?"<null>":this.resultFileURL));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}