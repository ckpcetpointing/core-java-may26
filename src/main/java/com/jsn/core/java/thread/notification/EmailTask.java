package com.jsn.core.java.thread.notification;

public class EmailTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Email sending started....");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Email sending done...");

    }
}
