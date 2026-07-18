package com.jsn.core.java.thread.sync;

public class WarService {

    public  void attack(String taskName) {
        System.out.println("Task " + taskName + " is preparing for war.");

        synchronized(this) {
            System.out.println("Task " + taskName + " is executing critical section.");
            delay();
            System.out.println("Task " + taskName + " has completed the critical section.");
        }

        System.out.println("Task " + taskName + " is executing non-critical section.");
        delay();
        System.out.println("Task " + taskName + " has completed the non-critical section.");


        System.out.println("Task " + taskName + " has finished preparing for war.");
    }

    private static void delay() {
        try {
            Thread.sleep(10000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
