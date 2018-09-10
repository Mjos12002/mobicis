package com.mobivat.mobivat_is.entity;

public class CustomerEntity {


    public String telephone;
    public String tin;
    public String name;

    public CustomerEntity(String telephone, String tin, String name) {
        this.telephone = telephone;
        this.tin = tin;
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
