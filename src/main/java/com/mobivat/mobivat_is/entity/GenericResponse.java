package com.mobivat.mobivat_is.entity;

public class GenericResponse {

    public String responseDescription;
    public String responseText;
    public String responseCode;
    public String recordID;

    public GenericResponse(String recordID, String responseDescription, String responseText, String responseCode) {
        this.responseDescription = responseDescription;
        this.responseText = responseText;
        this.responseCode = responseCode;
        this.recordID = recordID;
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
