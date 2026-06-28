package com.jsn.core.java.pass.by.value;

public class PassByValuePrimitiveDemo {

    public static void main(String[] args) {

        int originalValue = 10;
        System.out.println("Original Value before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("Original Value after method call: " + originalValue);
    }

    static void modifyValue(int value) {
        value = 20;
        System.out.println("Value inside method: " + value);
    }

}
