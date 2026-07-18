package com.jsn.core.java.collection;

import com.jsn.core.java.oops.poly.generic.CardPaymentRequest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {

    public static void main(String[] args) {
        Collection<String> indianCricketer = new ArrayList<>();
        indianCricketer.add("Virat Kohli");
        indianCricketer.add("Rohit Sharma");
        indianCricketer.add("MS Dhoni");
        indianCricketer.add("Jasprit Bumrah");


        //1st way to iterate over the collection
        Iterator<String> iterator =  indianCricketer.iterator();
        while (iterator.hasNext()){
            System.out.println("Elements- "+iterator.next());
        }

        //2nd way to iterate over the collection
        Collection<Long> empIds = new ArrayList<>();
        empIds.add(1001L);
        empIds.add(1002L);
        empIds.add(1003L);
        for (Long empId: empIds){
            System.out.println("Emp ID-Elements- "+empId);
        }

        //3rd way using forEach method
        empIds.forEach(e -> System.out.println("ForEach-Emp ID-Elements- "+e));



        System.out.println("Size of Collection: " + indianCricketer.size());
        //indianCricketer.clear();
        System.out.println("Is Collection Empty: "+indianCricketer.isEmpty());

        System.out.println("Does Collection contains Virat Kohli: "+indianCricketer.contains("Virat kohli"));

        //Use iterator to iterate over the collection

    }
}
