package com.jsn.core.java.exception;

public class AirthmeticExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Demonstrating ArithmeticException by dividing a number by zero.");
        int n1 = 0;
        int n2 = 10;
        divide(n1, n2);
        System.out.println("Continuing with the rest of the program after handling the exception.");
    }

    private static void divide(int n1, int n2) {
        try {
            System.out.println("Dividing " + n2 + " by " + n1);
            int result = n2 / n1;
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("NullPointerException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
    }
}
