package com.jsn.core.java;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! CSV FIle Reader");

        int number1 = 10;
        int number2 = 20;

        boolean result = number1 == number2;
        System.out.println(result);

        //Logical Operators example
        boolean isAdult = false;
        boolean hasID = false;
        System.out.println("isAdult : "+isAdult); // false
        System.out.println("hasID : "+hasID); // false
        System.out.println("isAdult && hasID : "+(isAdult && hasID)); // false
        System.out.println("isAdult || hasID : "+(isAdult || hasID)); // true
        System.out.println("!isAdult : "+(!isAdult)); // false


    }
}
