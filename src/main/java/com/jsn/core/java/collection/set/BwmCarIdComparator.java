package com.jsn.core.java.collection.set;

import com.jsn.core.java.oops.inrtnc.BMWCar;

import java.util.Comparator;

public class BwmCarIdComparator implements Comparator<BMWCar> {
    @Override
    public int compare(BMWCar o1, BMWCar o2) {
        System.out.println("o1 :"+o1.getId());
        return o1.getId().compareTo(o2.getId());
    }

    /**
     (BMWCar o1, BMWCar o2) -> o1.getId().compareTo(o2.getId())

     */
}
