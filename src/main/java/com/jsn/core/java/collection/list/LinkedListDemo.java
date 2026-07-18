package com.jsn.core.java.collection.list;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        ArrayList<String> argentinaFootBallPlayers = new ArrayList<>();
        argentinaFootBallPlayers.add("Lionel Messi");
        argentinaFootBallPlayers.add("Angel Di Maria");
        argentinaFootBallPlayers.add("Paulo Dybala");


        ArrayList<String> cloneArgFootBallPlayer = (ArrayList<String>) argentinaFootBallPlayers.clone();

        System.out.println(cloneArgFootBallPlayer);




        LinkedList<String> indianCricketer = new LinkedList<>(argentinaFootBallPlayers);
        indianCricketer.add("Virat Kohli");
        indianCricketer.add("Rohit Sharma");
        indianCricketer.add("MS Dhoni");

        indianCricketer.forEach(cricketer -> System.out.println(cricketer));

        Vector <String> englandCricketer = new Vector<>();
        englandCricketer.add("Joe Root");
        englandCricketer.add("Ben Stokes");
        englandCricketer.add("Jos Buttler");

        englandCricketer.forEach(cricketer -> System.out.println(cricketer));
        englandCricketer.iterator().forEachRemaining(cricketer -> System.out.println(cricketer));
        Enumeration<String> enumeration = englandCricketer.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
