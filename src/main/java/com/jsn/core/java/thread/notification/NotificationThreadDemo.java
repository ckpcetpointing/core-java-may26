package com.jsn.core.java.thread.notification;

public class NotificationThreadDemo {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();
       /* EmailTask emailTask = new EmailTask();
        emailTask.run();
        SmsTask smsTask = new SmsTask();
        smsTask.run();*/

        EmailTask emailTask = new EmailTask();
        Thread emailThread = new Thread(emailTask);
        emailThread.start();

        SmsTask smsTask = new SmsTask();
        Thread smsThread = new Thread(smsTask);
        smsThread.start();

        while (emailThread.isAlive()  | smsThread.isAlive()){
            continue;
        }

        long endTIme = System.currentTimeMillis();
        System.out.println("Total Execution TIme : "+ (endTIme-startTime)/1000L);




    }
}
