package com.jsn.core.java.exception;

public class ExceptionDemo4 {

    public static void main(String[] args) {

        try {

         String[] arr = new String[5];
            System.out.println(arr[10]);
            System.out.println("Rest of the code in try block");

        } catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (Exception e){
            System.out.println("General exception occurred: " + e.getMessage());
        }finally {
            System.out.println("Cleanup code");
        }

    }
}
