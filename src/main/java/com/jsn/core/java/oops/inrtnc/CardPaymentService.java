package com.jsn.core.java.oops.inrtnc;

public interface CardPaymentService extends PaymentService {

    void validateCardDetails(String cardNumber, String cardHolderName, String expiryDate, String cvv);
}
