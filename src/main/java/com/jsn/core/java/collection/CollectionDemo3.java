package com.jsn.core.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {

    public static void main(String[] args) {
        Collection<String> indianCricketer = new ArrayList<>();
        indianCricketer.add("Virat Kohli");
        indianCricketer.add("Rohit Sharma");
        indianCricketer.add("MS Dhoni");
        indianCricketer.add("Jasprit Bumrah");

        Collection<String> indianCricketerPlaying_11 = new ArrayList<>();
        indianCricketerPlaying_11.add("Virat Kohli");
        indianCricketerPlaying_11.add("Rohit Sharma");
        indianCricketerPlaying_11.add("MS Dhoni");
        indianCricketerPlaying_11.add("Yuvraj Singh");

        boolean result = indianCricketer.containsAll(indianCricketerPlaying_11);
        System.out.println("Does Collection contains all the elements of indianCricketerPlaying_11: "+result);

        indianCricketer.equals(indianCricketerPlaying_11);

        //indianCricketer.retainAll(indianCricketerPlaying_11);
        //System.out.println("After retaining all the elements of indianCricketerPlaying_11 from indianCricketer: "+indianCricketer);
        // indianCricketer.removeAll(indianCricketerPlaying_11);
        //System.out.println("After removing all the elements of indianCricketerPlaying_11 from indianCricketer: "+indianCricketer);



        //Create England cricketer collection
        Collection<String> englandCricketer = new ArrayList<>();
        englandCricketer.add("Joe Root");
        englandCricketer.add("Ben Stokes");
        englandCricketer.add("Jos Buttler");



    }
}
