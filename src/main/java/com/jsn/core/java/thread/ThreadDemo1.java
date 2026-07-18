package com.jsn.core.java.thread;

public class ThreadDemo1 {


    public static void main(String[] args) {
        ThreadCreationUsingInterface threadCreationUsingInterface = new ThreadCreationUsingInterface();
        Thread thread = new Thread(threadCreationUsingInterface);
        thread.setName("ThreadDemo1");
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Thread Name: " + thread.getName());
        thread.start(); // non-blocking call, it will not wait for the thread to finish, it will continue to execute the next line of code


        ThreadCreationUsingInterface threadCreationUsingInterface2 = new ThreadCreationUsingInterface();
        Thread thread2= new Thread(threadCreationUsingInterface2,"ThreadDemo2");
        System.out.println("Thread2 Priority: " + thread2.getPriority());
        System.out.println("Thread2 Name: " + thread2.getName());
        thread2.start(); // non-blocking call, it will not wait for the thread to finish, it will continue to execute the next line of code

    }
}
