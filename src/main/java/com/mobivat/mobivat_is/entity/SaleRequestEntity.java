package com.mobivat.mobivat_is.entity;


public class SaleRequestEntity {

    public int id;
    public String productCode;

    public SaleRequestEntity(String productCode) {
        this.productCode = productCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
