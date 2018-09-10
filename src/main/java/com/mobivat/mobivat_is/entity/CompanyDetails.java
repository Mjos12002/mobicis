package com.mobivat.mobivat_is.entity;

public class CompanyDetails {

    public String companyName;
    public String address;
    public String tin;
    public String telephone;

    public CompanyDetails(String companyName, String address, String tin, String telephone) {
        this.companyName = companyName;
        this.address = address;
        this.tin = tin;
        this.telephone = telephone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
