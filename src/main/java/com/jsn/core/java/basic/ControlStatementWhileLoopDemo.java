package com.jsn.core.java.basic;

public class ControlStatementWhileLoopDemo {
    public static void main(String[] args) {
        // Example of a while loop to print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Print a new line after the loop

        // Example of a while loop to print name from array
        String[] cvs = {"Alice", "Bob", "Charlie", "Diana"};

        System.out.println("Names in the array:");
        int j = 0;
        while (j < cvs.length) {
            System.out.println(cvs[j]);
            j++;
        }
    }
}
