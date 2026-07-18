package com.jsn.core.java.thread.sync;

import java.util.HashMap;

public class FetchCounterTask implements Runnable {

    private CounterCacheService counterCacheService;

    public FetchCounterTask(CounterCacheService counterCacheService) {
        this.counterCacheService = counterCacheService;
    }

    @Override
    public void run() {
        counterCacheService.fetchCounter();
    }

}
