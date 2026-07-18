package com.jsn.core.java.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        System.out.println("---TreeMap----");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Litchi", 100);
        treeMap.put("Apple", 500);
        treeMap.put("Banana", 600);
        treeMap.put("Pineapple", 30);
        treeMap.put("Chiku", 100);
        treeMap.put("MuskMelon", 10);
        treeMap.put("DragonFruit", 10);



        Set<String> keySet = treeMap.keySet();
        for (String s : keySet) {
            System.out.println(s);
        }

    }
}

