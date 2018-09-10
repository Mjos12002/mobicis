package com.mobivat.mobivat_is.entity;

public class MainProductEntity {

    public int id;
    public String productName;
    public int productTypeID;
    public String productDescription;
    public String dateCreated;

    public MainProductEntity(String productName, int productTypeID, String productDescription, String dateCreated) {
        this.productName = productName;
        this.productTypeID = productTypeID;
        this.productDescription = productDescription;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(int productTypeID) {
        this.productTypeID = productTypeID;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
