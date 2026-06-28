package com.jsn.core.java.exception;

import java.io.FileInputStream;

public class TryWithResourceDemo {

    public static void main(String[] args) {

      /*  //OLD style of handling resources with try-catch-finally
        FileInputStream fis = null;
        try{
             fis = new FileInputStream("non_existent_file.txt");
            // Use fis to read data from the file (not shown here)
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Failed to close FileInputStream: " + e.getMessage());
                }
            }
        } */

        // New style of handling resources with try-with-resources
        try(FileInputStream fis2 = new FileInputStream("non_existent_file.txt")) {
            System.out.println("Using try-with-resources to automatically manage the FileInputStream resource.");
            // Use fis2 to read data from the file (not shown here)
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try(CustomClass customClass = new CustomClass()) {
            System.out.println("Using try-with-resources to automatically manage the CustomClass resource.");
            customClass.test();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
