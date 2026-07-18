package com.jsn.core.java.oops.poly.generic;

public class PaymentServiceDemo {

    public static void main(String[] args) {
        PaymentService<CardPaymentResponse, CardPaymentRequest> cardPaymentService = new CardPaymentService();
        CardPaymentRequest request = new CardPaymentRequest();
        request.setCardNumber("1234567890123456");
        request.setCardHolderName("John Doe");
        request.setExpiryDate("12/25");
        request.setCvv("123");
        request.setAmount(100.0);

        CardPaymentResponse response = cardPaymentService.pay(request);
        System.out.println("Transaction ID: " + response.getTransactionId());
        System.out.println("Status: " + response.getStatus());
        System.out.println("Message: " + response.getMessage());

        PaymentService<String, String> neftPaymentService = new NEFTPaymentService();
        String accountNumber = "9876543210";
        String neftResponse = neftPaymentService.pay(accountNumber);
        System.out.println(neftResponse);
    }
}
