package com.jsn.core.java.oops.inrtnc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    String id;
    String color;
    double weight;

    //define parameterized constructor
    public Car(String id, String color, double weight) {
        this.id = id;
        this.color = color;
        this.weight = weight;

        System.out.println("Car is created with id: " + id + ", color: " + color + ", weight: " + weight);
    }

    void stop() {
        System.out.println("Car is stopped...");
    }

}
