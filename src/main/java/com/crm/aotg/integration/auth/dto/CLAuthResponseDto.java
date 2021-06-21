package com.crm.aotg.integration.auth.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CLAuthResponseDto {
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("AccessToken")
    @Expose
    private String accessToken;
    @SerializedName("ExpireTimestamp")
    @Expose
    private Long expireTimestamp;
    private final static long serialVersionUID = -571744718487365163L;

    /**
     * No args constructor for use in serialization
     *
     */
    public CLAuthResponseDto() {
    }

    /**
     *
     * @param expireTimestamp
     * @param name
     * @param id
     * @param accessToken
     */
    public CLAuthResponseDto(String id, String name, String accessToken, Long expireTimestamp) {
        super();
        this.id = id;
        this.name = name;
        this.accessToken = accessToken;
        this.expireTimestamp = expireTimestamp;
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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpireTimestamp() {
        return expireTimestamp;
    }

    public void setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLAuthRequestDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("accessToken");
        sb.append('=');
        sb.append(((this.accessToken == null)?"<null>":this.accessToken));
        sb.append(',');
        sb.append("expireTimestamp");
        sb.append('=');
        sb.append(((this.expireTimestamp == null)?"<null>":this.expireTimestamp));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
