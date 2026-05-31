package com.jsn.core.java.basic;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the input back to the user
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
