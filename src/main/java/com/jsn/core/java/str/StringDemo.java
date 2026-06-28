package com.jsn.core.java.str;

public class StringDemo {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("hello");

        System.out.println(str1 == str2);

        boolean result = str1.equalsIgnoreCase(str2);

        System.out.println("Are the two strings equal? " + result);


    }
}
