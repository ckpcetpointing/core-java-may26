package com.jsn.core.java.oops.poly.recharge;

public class AirtelRechargeService extends RechargeService {

    @Override
    public boolean validateMobileNumber(String mobileNumber) {
        System.out.println("AirtelRechargeService.validateMobileNumber called");
         return mobileNumber != null && mobileNumber.matches("\\d{10}") &&
                 mobileNumber.startsWith("7");
    }

     public void recharge(String mobileNumber, double amount) {
         if (validateMobileNumber(mobileNumber) ) {
             System.out.println("Recharging " + mobileNumber + " with amount " + amount);
         } else {
             System.out.println("Invalid mobile number or recharge amount.");
         }
     }
}
