package com.jsn.core.java.oops.poly.recharge;

public class JioRechargeService extends RechargeService {


    @Override
    public boolean validateMobileNumber(String mobileNumber) {
        System.out.println("JioRechargeService.validateMobileNumber called");
        boolean result = super.validateMobileNumber(mobileNumber);
        return result && mobileNumber.startsWith("9");
    }

     public void recharge(String mobileNumber, double amount) {
         if (validateMobileNumber(mobileNumber) ) {
             System.out.println("Recharging " + mobileNumber + " with amount " + amount);
         } else {
             System.out.println("Invalid mobile number or recharge amount.");
         }
     }
}
