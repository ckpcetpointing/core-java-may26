package com.jsn.core.java.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

    public static void main(String[] args) {

        //fruit inventory map  - Key = Fruit Name [String], Value = How many fruit - Number [Integer]

        HashMap<String, Integer> fruitInventory = new HashMap<>();
        fruitInventory.put("Apple", 500);
        fruitInventory.put("Banana", 600);
        fruitInventory.put("Pineapple", 30);
        fruitInventory.put("Chiku", 100);
        fruitInventory.put("MuskMelon", 10);
        fruitInventory.put("DragonFruit", 10);




        //fruitInventory.clear();
        System.out.println("Total Apple in store is "+fruitInventory.get("Apple"));

        System.out.println("Total Pomegranate in store is "+fruitInventory.getOrDefault("Pomegranate",0));


        Set<String> keySet = fruitInventory.keySet();

        keySet.forEach(k -> {
            System.out.println(k +":"+fruitInventory.get(k));
        });

        Collection<Integer> fruitValues = fruitInventory.values();
        fruitValues.forEach(v -> System.out.println(v));

        System.out.println("fruitInventory.containsKey(MuskMelon) :"+fruitInventory.containsKey("MuskMelon"));




    }
}

