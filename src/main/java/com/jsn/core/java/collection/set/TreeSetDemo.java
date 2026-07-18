package com.jsn.core.java.collection.set;

import com.jsn.core.java.oops.inrtnc.BMWCar;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> fruits = new TreeSet<>();
        System.out.println(fruits.add("Apple"));
        System.out.println(fruits.add("Banana"));
        System.out.println(fruits.add("Chiku"));
        System.out.println(fruits.add("Pinaple"));
        System.out.println(fruits.add("Apple"));
        System.out.println(fruits.add("MuskMelon"));


        System.out.println("--------------------------------------------------------");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        NavigableSet<String> descendingSet = fruits.descendingSet();
        System.out.println("--------------------------descendingSet------------------------------");
        Iterator<String> di = descendingSet.iterator();
        while (di.hasNext()){
            System.out.println(di.next());
        }





       TreeSet<BMWCar> bmwCarsSet = new TreeSet<>(new BwmCarIdComparator());

        bmwCarsSet.add(new BMWCar("BMW-1","White", 400.50));
        bmwCarsSet.add(new BMWCar("BMW-6","Black", 420.50));
        bmwCarsSet.add(new BMWCar("BMW-4","Blue", 450.50));

        bmwCarsSet.forEach(car -> System.out.println("BwmCarIdComparator CAR ID : "+car.getId()));

        System.out.println("Reversed : "+bmwCarsSet.reversed());
    }
}
