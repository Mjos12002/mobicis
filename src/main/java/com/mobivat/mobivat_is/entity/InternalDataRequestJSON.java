package com.mobivat.mobivat_is.entity;

import java.util.List;

public class InternalDataRequestJSON {

    public List<ProductEntity> productEntities;
    public CompanyDetails companyDetails;
    public CustomerEntity customerEntity;
    public AmountPaidEntity amountPaidEntity;

    public InternalDataRequestJSON(List<ProductEntity> productEntities, CompanyDetails companyDetails, CustomerEntity customerEntity, AmountPaidEntity amountPaidEntity) {
        this.productEntities = productEntities;
        this.companyDetails = companyDetails;
        this.customerEntity = customerEntity;
        this.amountPaidEntity = amountPaidEntity;
    }

    public AmountPaidEntity getAmountPaidEntity() {
        return amountPaidEntity;
    }

    public void setAmountPaidEntity(AmountPaidEntity amountPaidEntity) {
        this.amountPaidEntity = amountPaidEntity;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public CompanyDetails getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }

}
