package com.jsn.core.java.oops.inrtnc;

public class DebitCardPaymentService implements CardPaymentService {


    @Override
    public void validateCardDetails(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        // Implement card validation logic here
        System.out.println("Validating debit card details...");
    }

        @Override
    public void processPayment(double amount) {
        // Implement payment processing logic here
        System.out.println("Processing debit card payment of " + amount + " " + CURRENCY);
    }


    public static void main(String[] args) {
        DebitCardPaymentService debitCardPaymentService = new DebitCardPaymentService();
        debitCardPaymentService.validateCardDetails("1234-5678-9012-3456", "John Doe", "12/25", "123");
        debitCardPaymentService.processPayment(100.00);
    }
}
