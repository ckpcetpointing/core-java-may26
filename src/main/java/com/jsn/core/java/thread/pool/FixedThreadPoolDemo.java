package com.jsn.core.java.thread.pool;

import com.jsn.core.java.thread.RegisterDto;
import com.jsn.core.java.thread.notification.RegisterTask;
import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
    public static void main(String[] args) {



        String fixedPoolSize = System.getProperty("pool_size");
        System.out.println("Fixed Thread Pool Size : "+(fixedPoolSize != null ? Integer.parseInt(fixedPoolSize) : 2));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        RegisterTask registerTask1 = new RegisterTask(new RegisterDto("John Doe", "john.doe@gmail.com", "1234567890",stopWatch));
        RegisterTask registerTask2 = new RegisterTask(new RegisterDto("Jane Smith", "jane.smith@yahoo.com","345345353",stopWatch));
        RegisterTask registerTask3 = new RegisterTask(new RegisterDto("Lion Messi", "messi@argentina.com","456456645",stopWatch));

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(fixedPoolSize != null ? Integer.parseInt(fixedPoolSize) : 2);
        fixedThreadPool.execute(registerTask1);
        fixedThreadPool.execute(registerTask2);
        fixedThreadPool.execute(registerTask3);

        fixedThreadPool.shutdown();
        while (!fixedThreadPool.isTerminated()){
            continue;
        }
        stopWatch.stop();
        System.out.println("Total Execution Time : "+stopWatch.getTime()/1000L);
    }
}
