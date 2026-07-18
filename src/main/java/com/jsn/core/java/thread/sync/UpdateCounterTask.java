package com.jsn.core.java.thread.sync;

import java.util.HashMap;

public class UpdateCounterTask implements Runnable {

    private CounterCacheService counterCacheService;

    public UpdateCounterTask(CounterCacheService counterCacheService) {
        this.counterCacheService = counterCacheService;
    }

    @Override
    public void run() {
        counterCacheService.updateCounter();
    }
}
