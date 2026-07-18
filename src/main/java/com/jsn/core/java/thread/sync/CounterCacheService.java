package com.jsn.core.java.thread.sync;

import java.util.HashMap;

public class CounterCacheService {

    static HashMap<String, Integer> counterMap = new HashMap<>();

    public CounterCacheService(HashMap<String, Integer> counterMap) {
        this.counterMap = counterMap;
    }

    public  static synchronized void updateCounter() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Updating  the counter: " + counterMap.put("counter", counterMap.get("counter") + 1));
            delay();
        }
    }

    public static  synchronized void fetchCounter() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Fetch  the counter: " + counterMap.get("counter"));
            delay();
        }
    }

    private static void delay() {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
