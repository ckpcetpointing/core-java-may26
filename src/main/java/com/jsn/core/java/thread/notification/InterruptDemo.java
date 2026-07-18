package com.jsn.core.java.thread.notification;

public class InterruptDemo {

    public static void main(String[] args) throws InterruptedException {




        InterruptTask interruptTask = new InterruptTask();
        Thread interruptThread = new Thread(interruptTask,"InterruptTask-0");
        interruptThread.start();
        Thread.sleep(3000L);
        interruptThread.interrupt();
        System.out.println("InterruptTask is interrupted, now main thread will wait for interruptThread to complete its execution");
        System.out.println("interruptThread isAlive : "+interruptThread.isAlive());


    }
}
