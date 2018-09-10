package com.mobivat.mobivat_is.entity;

public class CyclosPaymentEntity {

    public float amount;
    public String from;
    public String to;
    public String description;
    public Long transferTypeID;

    public CyclosPaymentEntity(Long transferTypeID, float amount, String from, String to, String description) {
        this.amount = amount;
        this.from = from;
        this.to = to;
        this.description = description;
        this.transferTypeID = transferTypeID;
    }

    public Long getTransferTypeID() {
        return transferTypeID;
    }

    public void setTransferTypeID(Long transferTypeID) {
        this.transferTypeID = transferTypeID;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
