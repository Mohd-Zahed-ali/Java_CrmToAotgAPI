package com.crm.aotg.integration.common.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CLAOTGInitialRequestDto implements Serializable
{

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("StartTimestamp")
    @Expose
    private String startTimestamp;
    @SerializedName("EndTimestamp")
    @Expose
    private String endTimestamp;
    private final static long serialVersionUID = 581801801034833031L;

    /**
     * No args constructor for use in serialization
     *
     */
    public CLAOTGInitialRequestDto() {
    }

    /**
     *
     * @param name
     * @param id
     * @param endTimestamp
     * @param startTimestamp
     */
    public CLAOTGInitialRequestDto(String id, String name, String startTimestamp, String endTimestamp) {
        super();
        this.id = id;
        this.name = name;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public String getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLAOTGInitialRequestDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("startTimestamp");
        sb.append('=');
        sb.append(((this.startTimestamp == null)?"<null>":this.startTimestamp));
        sb.append(',');
        sb.append("endTimestamp");
        sb.append('=');
        sb.append(((this.endTimestamp == null)?"<null>":this.endTimestamp));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}