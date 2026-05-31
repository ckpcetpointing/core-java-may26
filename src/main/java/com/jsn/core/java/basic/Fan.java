package com.jsn.core.java.basic;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fan {

    String brand;
    int speed;

    Fan(){
        System.out.println("Fan object created using default constructor");
    }

    Fan(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
        System.out.println("Fan object created using parameterized constructor");
    }
}
