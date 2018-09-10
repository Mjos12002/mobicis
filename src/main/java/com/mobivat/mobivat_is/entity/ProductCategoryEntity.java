package com.mobivat.mobivat_is.entity;

public class ProductCategoryEntity {

    public int id;
    public String categoryName;
    public int categoryTaxTypeID;
    public String dateCreated;

    public ProductCategoryEntity(String categoryName, int categoryTaxTypeID, String dateCreated) {
        this.categoryName = categoryName;
        this.categoryTaxTypeID = categoryTaxTypeID;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryTaxTypeID() {
        return categoryTaxTypeID;
    }

    public void setCategoryTaxTypeID(int categoryTaxTypeID) {
        this.categoryTaxTypeID = categoryTaxTypeID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
