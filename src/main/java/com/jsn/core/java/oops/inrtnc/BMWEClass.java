package com.jsn.core.java.oops.inrtnc;

public class BMWEClass extends BMWCar  {

    public BMWEClass(String id, String color, double weight) {
        super(id, color, weight);
        System.out.println("BMW E Class Car is created with id: " + id + ", color: " + color + ", weight: " + weight);
    }

    void startCharging() {
        System.out.println("BMW Car is starting the charging...");
    }
}
