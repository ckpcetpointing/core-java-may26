package com.jsn.core.java.collection.set;

import com.jsn.core.java.oops.inrtnc.BMWCar;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

    public static void main(String[] args) {

        TreeSet<Integer> ids = new TreeSet<>();
        System.out.println(ids.add(1));
        System.out.println(ids.add(6));
        System.out.println(ids.add(9));
        System.out.println(ids.add(10));
        System.out.println(ids.add(7));

        System.out.println(ids);

        System.out.println("ids.floor(6) "+ids.floor(5)); //[1, 6, 7, 9, 10]
        System.out.println("ids.ceiling(6) "+ids.ceiling(4)); //[1, 6, 7, 9, 10]

        TreeSet headSet = (TreeSet) ids.headSet(7, true);
        System.out.println("headSet "+headSet);

        TreeSet tailSet = (TreeSet) ids.tailSet(6, true);
        System.out.println("tailSet "+tailSet);

       TreeSet subSet = (TreeSet) ids.subSet(6, true, 9, true);
        System.out.println("subSet "+subSet);




    }
}
