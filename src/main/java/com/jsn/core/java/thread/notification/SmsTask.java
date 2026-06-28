package com.jsn.core.java.thread.notification;

public class SmsTask implements  Runnable {

    @Override
    public void run() {
        System.out.println("SMS sending started....");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SMS sending done...");
    }
}
