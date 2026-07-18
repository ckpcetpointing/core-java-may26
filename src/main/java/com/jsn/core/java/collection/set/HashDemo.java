package com.jsn.core.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashDemo {

    public static void main(String[] args) {

        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("Mango");
        fruitList.add("Mango");
        fruitList.add("Apple");


        HashSet<String> fruits = new HashSet<>();
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


    }
}
