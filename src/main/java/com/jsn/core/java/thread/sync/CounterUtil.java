package com.jsn.core.java.thread.sync;

public class CounterUtil {

    static int counter = 0;

    public static int increment() {
        return counter++;
    }
}
