
package com.crm.aotg.integration.product.dto;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Image2 implements Serializable {

    private final static long serialVersionUID = -8533550392925005751L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image2.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
