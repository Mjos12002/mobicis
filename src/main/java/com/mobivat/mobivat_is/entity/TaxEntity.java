package com.mobivat.mobivat_is.entity;

public class TaxEntity {

    public int id;
    public String taxName;
    public String taxValue;
    public String dateCreated;

    public TaxEntity(String taxName, String taxValue, String dateCreated) {
        this.taxName = taxName;
        this.taxValue = taxValue;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public String getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(String taxValue) {
        this.taxValue = taxValue;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
