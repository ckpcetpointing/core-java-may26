package com.jsn.core.java.thread.sync;

import java.util.HashMap;

public class SynchronizationDemo {


    public static void main(String[] args) {
        HashMap<String, Integer> counterMap = new HashMap<>();
        counterMap.put("counter", 0);

        CounterCacheService counterCacheService_1 = new CounterCacheService(counterMap);
        CounterCacheService counterCacheService_2 = new CounterCacheService(counterMap);

        Thread thread2 = new Thread(new UpdateCounterTask(counterCacheService_1));
        thread2.start();
        Thread thread1 = new Thread(new FetchCounterTask(counterCacheService_1));
        thread1.start();
    }
}
