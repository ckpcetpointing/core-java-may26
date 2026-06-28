package com.jsn.core.java.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsUsageExceptionDemo {


    public static void main(String[] args) {

        try {
            readFile("non_existent_file.txt");

            Integer.parseInt("abc");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }

        System.out.println("Continuing with the rest of the program after handling the exception.");
    }


    private static void readFile(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
    }
}
