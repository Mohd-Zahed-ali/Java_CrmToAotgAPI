
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Attachment implements Serializable {

    private final static long serialVersionUID = -121991576453181896L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attachment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
