package com.jsn.core.java.basic;

public class MethodDemo {

    public static void main(String[] args) {

        System.out.println("Hello World! Method Demo");
        int age = MethodDemo.getAgeStatic();
        System.out.println("StaticAge: " + age);
        System.out.println("StaticAge: " + MethodDemo.getAgeStatic());
        MethodDemo demo = new MethodDemo();
        age = demo.getAgeNonStatic();
        System.out.println("NonStatic Age: " + age);


    }


    private static int getAgeStatic() { //static method
        return 25;
    }

    private int getAgeNonStatic() { //instance method
        return 30;
    }

    private void printMessage() { //void method
        System.out.println("This is a void method.");
    }

    private String getGreeting(String name) { //method with parameters and return type
        return "Hello, " + name + "!";
    }
}
