package com.jsn.core.java.basic;

public class ConstructorDemo {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println("Fan 1 - Brand: " + fan1.getBrand() + ", Speed: " + fan1.getSpeed());

        Fan fan2 = new Fan("Panasonic", 3);
        System.out.println("Fan 2 - Brand: " + fan2.getBrand() + ", Speed: " + fan2.getSpeed());
    }
}
