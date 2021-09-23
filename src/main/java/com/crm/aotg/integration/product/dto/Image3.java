
package com.crm.aotg.integration.product.dto;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Image3 implements Serializable {

    private final static long serialVersionUID = 6187276335333759974L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image3.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
