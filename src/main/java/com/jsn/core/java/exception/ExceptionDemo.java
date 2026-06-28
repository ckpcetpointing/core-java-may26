package com.jsn.core.java.exception;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            System.out.println("1. Read FIle ");
            String data = "This is core java batch";
            System.out.println(data.length());
            System.out.println("2. Process Data");
            System.out.println("3. Write Output");

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("4. Close Resources");
        }
        System.out.println("5.. Send email notification if file processed successfully or not");
    }
}
