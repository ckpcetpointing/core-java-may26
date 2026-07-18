package com.jsn.core.java.oops.poly.generic;

public class CardPaymentService implements PaymentService<CardPaymentResponse, CardPaymentRequest> {

    @Override
    public CardPaymentResponse pay(CardPaymentRequest cardPaymentRequest) {
        double amount = cardPaymentRequest.getAmount();
        System.out.println("CardPaymentService.pay called with amount: " + amount);
        // Simulate payment processing logic
        CardPaymentResponse response = new CardPaymentResponse();
        response.setStatus("SUCCESS");
        response.setMessage( "Payment successful" );

        return response;
    }
}
