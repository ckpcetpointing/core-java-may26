package com.jsn.core.java.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AdditionTask additionTask = new AdditionTask(10, 20);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> result =  executorService.submit(additionTask);

        System.out.println("Result of addition task is : "+result.get());//BLOCKING CALL

        //submit another task
        System.out.println("Main thread is done");
    }
}
