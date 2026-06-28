package com.jsn.core.java.exception;

public class ThrowUsageExceptionDemo {


    public static void main(String[] args) {
        try {
            withdrawal(6000);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
            System.out.println("Caught InsufficientBalanceException: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our banking services.");
        }
    }

    private static void withdrawal(double withdrawalAmount) throws InsufficientBalanceException {
        double balance = 5000;
        if (withdrawalAmount > balance) {
            throw new InsufficientBalanceException("Withdrawal withdrawalAmount:"+withdrawalAmount+" exceeds available balance:"+balance+".");
        }
        System.out.println("Withdrawal successful. Remaining balance: " + (balance - withdrawalAmount)); // Not executed if exception is thrown
    }
}
