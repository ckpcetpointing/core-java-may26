package com.jsn.core.java.thread;

import com.jsn.core.java.thread.notification.SmsTask;

public class ThreadLifeCycleDemo {

    public static void main(String[] args) throws InterruptedException {

        SmsTask smsTask = new SmsTask();
        Thread smsThread = new Thread(smsTask);
        System.out.println("SmsThread before start state : "+smsThread.getState());
        smsThread.start(); // NON blocking call
        smsThread.start(); // Exception in thread "main" java.lang.IllegalThreadStateException: Thread already started.
        System.out.println("SmsThread after start state : "+smsThread.getState());
        smsThread.join(); // Blocking until sms thread done
        System.out.println("SmsThread  state : "+smsThread.getState());


        Runnable task = () -> {
                System.out.println("Anonymous thread started");


        };

        Thread smsThread2 = new Thread(task);
        smsThread2.start();






    }
}
