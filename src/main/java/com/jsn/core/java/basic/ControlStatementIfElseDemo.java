package com.jsn.core.java.basic;

public class ControlStatementIfElseDemo {

    public static void main(String[] args) {
        withdraw(6000.00); // Example of insufficient funds
        //Write bad code so Sonar lint will give you warning and then write good code to remove the warning

    }

    private static void withdraw(double withdrawalAmount) {
        //Give example related to banking system
        double a = 5000.00;

        //multiple if-else statements
        if (withdrawalAmount > a) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else if (withdrawalAmount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            a = a - withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + a);
        }
    }
}
