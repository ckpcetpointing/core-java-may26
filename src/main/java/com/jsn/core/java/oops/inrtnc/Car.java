package com.jsn.core.java.oops.inrtnc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Car implements Serializable {

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
