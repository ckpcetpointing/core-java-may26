package com.jsn.core.java.oops.poly.generic;

public class NEFTPaymentService implements PaymentService<String, String> {

    @Override
    public String pay(String accountNumber) {
        System.out.println("NEFTPaymentService.pay called with accountNumber: " + accountNumber);
        // Simulate NEFT payment processing logic here
        return "NEFT Payment successful for account number: " + accountNumber;
    }
}
