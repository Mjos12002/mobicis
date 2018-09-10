package com.mobivat.mobivat_is.entity;

public class ProductOrderTotalEntity {

    public int id;
    public int customerID;
    public int merchantID;
    public String date;
    public int totalAmount;

    public ProductOrderTotalEntity(int customerID, int merchantID, String date, int totalAmount) {
        this.customerID = customerID;
        this.merchantID = merchantID;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(int merchantID) {
        this.merchantID = merchantID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
