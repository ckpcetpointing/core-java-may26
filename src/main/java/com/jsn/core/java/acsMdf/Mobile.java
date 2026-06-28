package com.jsn.core.java.acsMdf;

public class Mobile {

    private String serialNumber;
    private String model;
    private String brand;

    //declare private setter and getter methods for all the above fields

    public String getSerialNumber() {  //getSerialNumber have the default access modifier, so it can be accessed within the same package
        return serialNumber;
    }

     public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    private String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
