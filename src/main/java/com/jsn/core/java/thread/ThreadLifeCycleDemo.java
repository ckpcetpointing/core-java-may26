package com.jsn.core.java.thread;

import com.jsn.core.java.thread.notification.SmsTask;

public class ThreadLifeCycleDemo {

    public static void main(String[] args) throws InterruptedException {

        SmsTask smsTask = new SmsTask();
        Thread smsThread = new Thread(smsTask);
        System.out.println("SmsThread before start state : "+smsThread.getState());
        smsThread.start(); // NON blocking call
        System.out.println("SmsThread after start state : "+smsThread.getState());
        smsThread.join(); // Blocking until sms thread done
        System.out.println("SmsThread  state : "+smsThread.getState());


    }
}
