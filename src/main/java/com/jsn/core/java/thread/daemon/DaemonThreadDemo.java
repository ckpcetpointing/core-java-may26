package com.jsn.core.java.thread.daemon;

public class DaemonThreadDemo {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Main thread started");
        DaemonThread daemonThread = new DaemonThread(); // Normal thread
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Main thread going for 10 second sleep");
        Thread.sleep(10000);
        System.out.println("Main thread terminated");

    }


}




class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println("Daemon thread started");
        while (true) {
            System.out.println("Daemon thread running....");
            sleep();
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
