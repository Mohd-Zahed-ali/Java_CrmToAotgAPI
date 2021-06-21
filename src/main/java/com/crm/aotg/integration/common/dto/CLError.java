package com.crm.aotg.integration.common.dto;

import java.io.Serializable;
import java.util.List;

public class CLError implements Serializable {
    public String message;
    public String errorCode;
    public String jsonsyntax;
    public String paramVals;
    public List<String> restrictedFields;
    public List<String> duplicateHeaderFields;
    public List<String> duplicateBodyFields;
    public List<String> invalidFieldValues;
    public List<String> missingMandatoryFields;
    public List<String> invalidFields;

    @Override
    public String toString() {
        return "CLError{" +
                "message='" + message + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", jsonsyntax='" + jsonsyntax + '\'' +
                ", paramVals='" + paramVals + '\'' +
                ", restrictedFields=" + restrictedFields +
                ", duplicateHeaderFields=" + duplicateHeaderFields +
                ", duplicateBodyFields=" + duplicateBodyFields +
                ", invalidFieldValues=" + invalidFieldValues +
                ", missingMandatoryFields=" + missingMandatoryFields +
                ", invalidFields=" + invalidFields +
                '}';
    }

    public CLError(String message, String errorCode, String jsonsyntax, String paramVals, List<String> restrictedFields, List<String> duplicateHeaderFields, List<String> duplicateBodyFields, List<String> invalidFieldValues, List<String> missingMandatoryFields, List<String> invalidFields) {
        this.message = message;
        this.errorCode = errorCode;
        this.jsonsyntax = jsonsyntax;
        this.paramVals = paramVals;
        this.restrictedFields = restrictedFields;
        this.duplicateHeaderFields = duplicateHeaderFields;
        this.duplicateBodyFields = duplicateBodyFields;
        this.invalidFieldValues = invalidFieldValues;
        this.missingMandatoryFields = missingMandatoryFields;
        this.invalidFields = invalidFields;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getJsonsyntax() {
        return jsonsyntax;
    }

    public void setJsonsyntax(String jsonsyntax) {
        this.jsonsyntax = jsonsyntax;
    }

    public String getParamVals() {
        return paramVals;
    }

    public void setParamVals(String paramVals) {
        this.paramVals = paramVals;
    }

    public List<String> getRestrictedFields() {
        return restrictedFields;
    }

    public void setRestrictedFields(List<String> restrictedFields) {
        this.restrictedFields = restrictedFields;
    }

    public List<String> getDuplicateHeaderFields() {
        return duplicateHeaderFields;
    }

    public void setDuplicateHeaderFields(List<String> duplicateHeaderFields) {
        this.duplicateHeaderFields = duplicateHeaderFields;
    }

    public List<String> getDuplicateBodyFields() {
        return duplicateBodyFields;
    }

    public void setDuplicateBodyFields(List<String> duplicateBodyFields) {
        this.duplicateBodyFields = duplicateBodyFields;
    }

    public List<String> getInvalidFieldValues() {
        return invalidFieldValues;
    }

    public void setInvalidFieldValues(List<String> invalidFieldValues) {
        this.invalidFieldValues = invalidFieldValues;
    }

    public List<String> getMissingMandatoryFields() {
        return missingMandatoryFields;
    }

    public void setMissingMandatoryFields(List<String> missingMandatoryFields) {
        this.missingMandatoryFields = missingMandatoryFields;
    }

    public List<String> getInvalidFields() {
        return invalidFields;
    }

    public void setInvalidFields(List<String> invalidFields) {
        this.invalidFields = invalidFields;
    }
}
