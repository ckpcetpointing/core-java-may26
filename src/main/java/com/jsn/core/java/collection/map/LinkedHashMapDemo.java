package com.jsn.core.java.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        //fruit inventory map  - Key = Fruit Name [String], Value = How many fruit - Number [Integer]

        HashMap<String, Integer> fruitInventoryMap = new HashMap<>();
        fruitInventoryMap.put("Apple", 500);
        fruitInventoryMap.put("Banana", 600);
        fruitInventoryMap.put("Pineapple", 30);
        fruitInventoryMap.put("Chiku", 100);
        fruitInventoryMap.put("MuskMelon", 10);
        fruitInventoryMap.put("DragonFruit", 10);

        Set<String>  keySet = fruitInventoryMap.keySet();
        for (String s : keySet) {
            System.out.println(s);
        }

        System.out.println("---LinkedHashMap----");

        LinkedHashMap<String, Integer> linkedFruitHashMap = new LinkedHashMap<>();
        linkedFruitHashMap.put("Apple", 500);
        linkedFruitHashMap.put("Banana", 600);
        linkedFruitHashMap.put("Pineapple", 30);
        linkedFruitHashMap.put("Chiku", 100);
        linkedFruitHashMap.put("MuskMelon", 10);
        linkedFruitHashMap.put("DragonFruit", 10);

        keySet = linkedFruitHashMap.keySet();
        for (String s : keySet) {
            System.out.println(s);
        }





    }
}

