package com.jsn.core.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

    public static void main(String[] args) {


        ArrayList<String> argentinaFootBallPlayers = new ArrayList<>();
        argentinaFootBallPlayers.add("Lionel Messi");
        argentinaFootBallPlayers.add("Angel Di Maria");
        argentinaFootBallPlayers.add("Paulo Dybala");

        ArrayList<String> globalFootBallPlayers = new ArrayList<>(argentinaFootBallPlayers);
        globalFootBallPlayers.add("Neymar");
        globalFootBallPlayers.add("Philippe Coutinho");
        globalFootBallPlayers.add("Gabriel Jesus");

        System.out.println("Global FootBall Players: "+globalFootBallPlayers);




    }
}
