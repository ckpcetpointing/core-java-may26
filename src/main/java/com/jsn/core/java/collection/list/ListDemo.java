package com.jsn.core.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> weekDays = new ArrayList<>();
        weekDays.add("Monday"); //0
        weekDays.add("Tuesday"); //1
        weekDays.add("Wednesday"); // 2
        weekDays.add("Thursday"); // 3
        weekDays.add("Friday"); // 4
        weekDays.add("Friday"); // 5



        System.out.println("Index of Friday: "+weekDays.indexOf("Friday"));

        System.out.println("Before Value at index -1 : "+weekDays.get(1));
        System.out.println("Before Value at index -2: "+weekDays.get(2));

        weekDays.add(1,"Sunday"); // 1

        System.out.println("After Value at index -1 : "+weekDays.get(1));
        System.out.println("After Value at index -2: "+weekDays.get(2));
        System.out.println("weekDays: "+weekDays);


      /*  Iterator<String> iterator= weekDays.iterator();
        while (iterator.hasNext()){
            String day = iterator.next();
            System.out.println(day);
        }*/




    }
}
