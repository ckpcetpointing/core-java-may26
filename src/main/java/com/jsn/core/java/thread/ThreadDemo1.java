package com.jsn.core.java.thread;

public class ThreadDemo1 {


    public static void main(String[] args) {
        ThreadCreationUsingInterface threadCreationUsingInterface = new ThreadCreationUsingInterface();

        Thread thread = new Thread(threadCreationUsingInterface);
        thread.start();

        ThreadCreationUsingThreadClass threadCreationUsingThreadClass = new ThreadCreationUsingThreadClass();
        threadCreationUsingThreadClass.start();

    }
}
