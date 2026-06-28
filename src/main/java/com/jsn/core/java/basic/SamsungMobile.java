package com.jsn.core.java.basic;

import com.jsn.core.java.acsMdf.Mobile;

public class SamsungMobile  {


    public static void main(String[] args) {
        Mobile samsungMobile = new Mobile();
        samsungMobile.setSerialNumber("SN123456789");
        samsungMobile.setBrand("Samsung");
        System.out.println("Samsung Mobile Serial Number: " + samsungMobile.getSerialNumber());
    }

}
