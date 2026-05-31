package com.jsn.core.java.basic;

public class Laptop {

    String brand;
    int ram;
    static String operatingSystem = "Windows 10";



    public void start() {
        System.out.println("Laptop is starting...");
        int batteryLevel = 100;
        while (batteryLevel > 0) {
            System.out.println("Battery level: " + batteryLevel + "%");
            batteryLevel -= 20;
        }
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.brand = "Dell";
        System.out.println("Laptop brand: " + laptop.brand);
        System.out.println("Laptop ram: " + laptop.ram);

        System.out.println("laptop.operatingSystem "+Laptop.operatingSystem);

        Laptop laptop2 = new Laptop();
        laptop2.brand = "HP";
        System.out.println("Laptop 2 brand: " + laptop2.brand);
        System.out.println("laptop2.operatingSystem "+Laptop.operatingSystem);

        Laptop laptop3 = laptop;
        System.out.println("Laptop 3 brand: " + laptop3.brand);
        laptop3.brand = "Lenovo";

        System.out.println("Laptop brand after change: " + laptop.brand);
        System.out.println("Laptop 3 brand after change: " + laptop3.brand);

    }

}
