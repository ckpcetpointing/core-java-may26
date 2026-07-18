package com.jsn.core.java.thread.pool;

import com.jsn.core.java.thread.RegisterDto;
import com.jsn.core.java.thread.notification.RegisterTask;
import org.apache.commons.lang3.time.StopWatch;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolDemo {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);

        RegisterDto registerDto = new RegisterDto("John Doe",
                "john.doe@gmail.com", "1234567890",stopWatch);


        RegisterTask registerTask1 = new RegisterTask(registerDto);
        System.out.println("Schedule Task started at time : "+ LocalTime.now());
        //scheduledThreadPool.schedule(registerTask1, 5, TimeUnit.SECONDS);


        // scheduledThreadPool.scheduleAtFixedRate(registerTask1, 5, 10, TimeUnit.SECONDS);



        scheduledThreadPool.scheduleWithFixedDelay(registerTask1, 5, 10, TimeUnit.SECONDS);


    }
}
