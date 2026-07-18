package com.jsn.core.java.collection.set;

import com.jsn.core.java.oops.inrtnc.BMWCar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        System.out.println(fruits.add("Apple"));
        System.out.println(fruits.add("Banana"));
        System.out.println(fruits.add("Chiku"));
        System.out.println(fruits.add("Pinaple"));
        System.out.println(fruits.add("Apple"));
        System.out.println(fruits.add("MuskMelon"));
        System.out.println(fruits.add(null));
        System.out.println(fruits.add(null));


        System.out.println("--------------------------------------------------------");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        LinkedHashSet<BMWCar> bmwCarsSet = new LinkedHashSet<>();

        bmwCarsSet.add(new BMWCar("BMW-1","White", 400.50));
        bmwCarsSet.add(new BMWCar("BMW-4","Black", 420.50));
        bmwCarsSet.add(new BMWCar("BMW-6","Blue", 450.50));

        bmwCarsSet.forEach(car -> System.out.println("CAR ID : "+car.getId()));

    }
}
