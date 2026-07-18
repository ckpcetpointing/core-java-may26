package com.jsn.core.java.thread.notification;

public class EmailTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Email sending started....");
        try {
            System.out.println(Thread.currentThread().getName() + " thread name EmailTask to complete its execution");
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Email sending done...");

    }
}
