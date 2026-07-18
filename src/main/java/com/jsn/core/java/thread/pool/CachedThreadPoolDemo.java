package com.jsn.core.java.thread.pool;

import com.jsn.core.java.thread.RegisterDto;
import com.jsn.core.java.thread.notification.RegisterTask;
import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
    public static void main(String[] args) {


        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            RegisterTask registerTask = new RegisterTask(new RegisterDto("John Doe "+i, "jone.doe-" + i + "@gmail.com", "1234567890"+i,stopWatch));
            cachedThreadPool.execute(registerTask);
        }
        cachedThreadPool.shutdown();
        while (!cachedThreadPool.isTerminated()){
            continue;
        }
        stopWatch.stop();
        System.out.println("Total Execution Time : "+stopWatch.getTime()/1000L);
    }
}
