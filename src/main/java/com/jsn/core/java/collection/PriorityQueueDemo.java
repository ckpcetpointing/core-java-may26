package com.jsn.core.java.collection;

import com.jsn.core.java.collection.set.BwmCarIdComparator;
import com.jsn.core.java.oops.inrtnc.BMWCar;
import com.jsn.core.java.oops.inrtnc.Car;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {


    public static void main(String[] args) {
        PriorityQueue<String> fruits = new PriorityQueue<>();
        System.out.println(fruits.add("A"));

        System.out.println(fruits.add("A"));
        System.out.println(fruits.add("B"));
        System.out.println(fruits.add("C"));
        System.out.println(fruits.add("P"));
        System.out.println(fruits.add("M"));

        System.out.println(fruits.poll());
        System.out.println(fruits.poll());
        System.out.println(fruits.poll());
        System.out.println(fruits.poll());
        System.out.println(fruits.poll());

        PriorityQueue<BMWCar> bmwCarsSet = new PriorityQueue<>(Comparator.comparing(Car::getId));

        bmwCarsSet.add(new BMWCar("BMW-1","White", 400.50));
        bmwCarsSet.add(new BMWCar("BMW-6","Black", 420.50));
        bmwCarsSet.add(new BMWCar("BMW-4","Blue", 450.50));

        System.out.println(bmwCarsSet.poll());
        System.out.println(bmwCarsSet.poll());
        System.out.println(bmwCarsSet.poll());


    }
}
