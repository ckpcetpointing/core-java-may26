package com.jsn.core.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionDemo4 {

    public static void main(String[] args) {
        Collection<String> indianCricketer = new ArrayList<>();
        indianCricketer.add("Virat Kohli");
        indianCricketer.add("Rohit Sharma");
        indianCricketer.add("MS Dhoni");
        indianCricketer.add("Jasprit Bumrah");

        //Create England cricketer collection
        Collection<String> englandCricketer = new ArrayList<>();
        englandCricketer.add("Joe Root");
        englandCricketer.add("Ben Stokes");
        englandCricketer.add("Jos Buttler");

        Collection<String> allCricketer = new ArrayList<>();
        allCricketer.addAll(indianCricketer);
        allCricketer.addAll(englandCricketer);
        System.out.println("All Cricketer: "+allCricketer);


        //indianCricketer.removeIf(s -> s.startsWith("V"));
        //System.out.println("After removing all the elements starting with V from indianCricketer: "+indianCricketer);

        ArrayList<String> indianCricketer2 = new ArrayList<>();
        indianCricketer2.add("Virat Kohli");
        indianCricketer2.add("Rohit Sharma");
        indianCricketer2.add("MS Dhoni");
        indianCricketer2.add("Jasprit Bumrah");

        System.out.println(indianCricketer.equals(indianCricketer2));

    }
}
