package com.jsn.core.java.oops.poly.recharge;

public class RechargeAppDemo {

    public static void main(String[] args) {
        RechargeService rechargeService = new JioRechargeService();
        rechargeService.validateMobileNumber("1234567890");

        RechargeService airtelRechargeService = new AirtelRechargeService();
        airtelRechargeService.validateMobileNumber("9876543210");
    }
}
