package com.jsn.core.java.exception.nested;

public class NestedTryCatchExceptionDemo {

    public static void main(String[] args) {

        try {  //outer try block
            System.out.println("Outer try block");
            int[] arr = new int[5];
            System.out.println(arr[0]);

            try { //inner try block
                System.out.println("Inner try block");
                String str = null;
                System.out.println(str.length()); // This will throw NullPointerException
                System.out.println("Rest of the inner try block");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("Caught NullPointerException in inner catch block: " + e.getMessage());
            }
            System.out.println("Outer try block continues after inner try-catch");

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Caught ArrayIndexOutOfBoundsException in outer catch block: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
