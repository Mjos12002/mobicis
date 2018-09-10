package com.mobivat.mobivat_is.entity;

public class ProductEntity {

    public int productID;
    public int productFamilyID;
    public String productName;
    public int productPrice;
    public int taxRateID;
    public String barCode;

    public ProductEntity(int productID, int productFamilyID, String productName, int productPrice, int taxRateID, String barCode) {
        this.productID = productID;
        this.productFamilyID = productFamilyID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.taxRateID = taxRateID;
        this.barCode = barCode;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductFamilyID() {
        return productFamilyID;
    }

    public void setProductFamilyID(int productFamilyID) {
        this.productFamilyID = productFamilyID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getTaxRateID() {
        return taxRateID;
    }

    public void setTaxRateID(int taxRateID) {
        this.taxRateID = taxRateID;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
