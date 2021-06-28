
package com.crm.aotg.integration.salesorder.dto;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TransferFromQuotationDocument implements Serializable
{

    @SerializedName("FullTransferFromSalesDocument")
    @Expose
    private List<Object> fullTransferFromSalesDocument = null;
    @SerializedName("PartialTransferFromSalesDocument")
    @Expose
    private List<Object> partialTransferFromSalesDocument = null;
    private final static long serialVersionUID = 7834037445815381024L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransferFromQuotationDocument() {
    }

    /**
     * 
     * @param partialTransferFromSalesDocument
     * @param fullTransferFromSalesDocument
     */
    public TransferFromQuotationDocument(List<Object> fullTransferFromSalesDocument, List<Object> partialTransferFromSalesDocument) {
        super();
        this.fullTransferFromSalesDocument = fullTransferFromSalesDocument;
        this.partialTransferFromSalesDocument = partialTransferFromSalesDocument;
    }

    public List<Object> getFullTransferFromSalesDocument() {
        return fullTransferFromSalesDocument;
    }

    public void setFullTransferFromSalesDocument(List<Object> fullTransferFromSalesDocument) {
        this.fullTransferFromSalesDocument = fullTransferFromSalesDocument;
    }

    public List<Object> getPartialTransferFromSalesDocument() {
        return partialTransferFromSalesDocument;
    }

    public void setPartialTransferFromSalesDocument(List<Object> partialTransferFromSalesDocument) {
        this.partialTransferFromSalesDocument = partialTransferFromSalesDocument;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferFromQuotationDocument.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullTransferFromSalesDocument");
        sb.append('=');
        sb.append(((this.fullTransferFromSalesDocument == null)?"<null>":this.fullTransferFromSalesDocument));
        sb.append(',');
        sb.append("partialTransferFromSalesDocument");
        sb.append('=');
        sb.append(((this.partialTransferFromSalesDocument == null)?"<null>":this.partialTransferFromSalesDocument));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
