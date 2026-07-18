package com.jsn.core.java.thread.notification;

import java.time.Duration;

public class InterruptTask implements Runnable{

    @Override
    public void run() {
        System.out.println("InterruptTask started....");
       while(true){
           System.out.println("InterruptTask is running....");
           try {
               Thread.sleep(5000L);//TImed_wait for 5 seconds before interrupting the thread
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
