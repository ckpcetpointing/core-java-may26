package com.jsn.core.java.oops.poly.recharge;

public class RechargeService {

    public boolean validateMobileNumber(String mobileNumber) {
        System.out.println("RechargeService.validateMobileNumber called");
        return mobileNumber != null && mobileNumber.matches("\\d{10}");
    }


}
