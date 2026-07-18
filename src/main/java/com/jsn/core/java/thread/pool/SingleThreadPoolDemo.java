package com.jsn.core.java.thread.pool;

import com.jsn.core.java.thread.RegisterDto;
import com.jsn.core.java.thread.notification.EmailTask;
import com.jsn.core.java.thread.notification.RegisterTask;
import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolDemo {
    public static void main(String[] args) {


        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        RegisterTask registerTask1 = new RegisterTask(new RegisterDto("John Doe", "john.doe@gmail.com", "1234567890",stopWatch));
        RegisterTask registerTask2 = new RegisterTask(new RegisterDto("Jane Smith", "jane.smith","345345353",stopWatch));

        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        singleThreadPool.execute(registerTask1);
        singleThreadPool.execute(registerTask2);

        singleThreadPool.shutdown();
        while (!singleThreadPool.isTerminated()){
            continue;
        }
        stopWatch.stop();
        System.out.println("Total Execution Time : "+stopWatch.getTime()/1000L);
    }
}
