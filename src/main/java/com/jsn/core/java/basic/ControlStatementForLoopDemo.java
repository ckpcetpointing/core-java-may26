package com.jsn.core.java.basic;

public class ControlStatementForLoopDemo {
    public static void main(String[] args) {
        // Example of a for loop to print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a new line after the loop

       // Example of for loop to print name from array
        String[] cvs = {"Alice", "Bob", "Charlie", "Diana"};

        System.out.println("Names in the array:");
        for (int i = 0; i < cvs.length; i++) {
            System.out.println(cvs[i]);
        }

    }
}
