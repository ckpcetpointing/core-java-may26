package com.jsn.core.java.thread.notification;

public class NotificationThreadDemo {

    public static void main(String[] args) throws InterruptedException {


        long startTime = System.currentTimeMillis();
       /* EmailTask emailTask = new EmailTask();
        emailTask.run();
        SmsTask smsTask = new SmsTask();
        smsTask.run();*/

        EmailTask emailTask = new EmailTask();
        Thread emailThread = new Thread(emailTask);
        emailThread.setName("Email Thread-0");
        emailThread.start();

        System.out.println("****Email Thread is started, now main thread will wait for emailThread to complete its execution before moving forward");
        System.out.println(Thread.currentThread().getName() + " is waiting for emailThread to complete its execution");
        System.out.println("****Email Thread is completed, now main thread will start SMS Thread");
        SmsTask smsTask = new SmsTask();
        Thread smsThread = new Thread(smsTask);
        smsThread.start();

        smsThread.interrupt();// useful to stop the thread execution if it is in sleep or wait state

        while (emailThread.isAlive()  | smsThread.isAlive()){
            continue;
        }

        long endTIme = System.currentTimeMillis();
        System.out.println("Total Execution TIme : "+ (endTIme-startTime)/1000L);




    }
}
