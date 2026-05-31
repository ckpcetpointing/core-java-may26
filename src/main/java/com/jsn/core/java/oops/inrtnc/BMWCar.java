package com.jsn.core.java.oops.inrtnc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BMWCar extends Car {

    String display;
    String charging;

    public BMWCar(String id, String color, double weight) {
        super(id, color, weight);
        System.out.println("BMW Car is created with id: " + id + ", color: " + color + ", weight: " + weight);
    }

    void startDisplay() {
        System.out.println("BMW Car is starting the display...");
    }
}
