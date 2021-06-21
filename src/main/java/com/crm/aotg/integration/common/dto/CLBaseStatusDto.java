package com.crm.aotg.integration.common.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class CLBaseStatusDto implements Serializable {
    public Integer status;
    public String msg;
    public String error_msg;
}
