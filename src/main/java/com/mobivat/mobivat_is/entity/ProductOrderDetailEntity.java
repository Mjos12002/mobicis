package com.mobivat.mobivat_is.entity;


public class ProductOrderDetailEntity {
    public int id;
    public int productID;
    public String productName;
    public int unitPrice;
    public int totalCost;
    public int quantity;
    public int vatValue;
    public String vatType;

    public ProductOrderDetailEntity(int productID, String productName, int unitPrice, int totalCost, int quantity, int vatValue, String vatType) {
        this.productID = productID;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.totalCost = totalCost;
        this.quantity = quantity;
        this.vatValue = vatValue;
        this.vatType = vatType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getVatValue() {
        return vatValue;
    }

    public void setVatValue(int vatValue) {
        this.vatValue = vatValue;
    }

    public String getVatType() {
        return vatType;
    }

    public void setVatType(String vatType) {
        this.vatType = vatType;
    }
}
