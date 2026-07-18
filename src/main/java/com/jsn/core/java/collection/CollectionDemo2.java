package com.jsn.core.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {

    public static void main(String[] args) {
        Collection<String> indianCricketer = new ArrayList<>();
        indianCricketer.add("Virat Kohli");
        indianCricketer.add("Rohit Sharma");
        indianCricketer.add("MS Dhoni");
        indianCricketer.add("Jasprit Bumrah");

        Object[] indianCricketersArry =  indianCricketer.toArray();
        System.out.println("indianCricketersArry: "+indianCricketersArry);

        //convert to String[] from indianCricketer using toArray(T[] a) method
        String[] indianCricketersArry2 =  indianCricketer.toArray(new String[0]);
        System.out.println("indianCricketersArry2: "+indianCricketersArry2);

    }
}
