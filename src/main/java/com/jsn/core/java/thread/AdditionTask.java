package com.jsn.core.java.thread;

import java.util.concurrent.Callable;

public class AdditionTask implements Callable<Integer> {

    private int a;
    private int b;

    public AdditionTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        //
        return a + b;
    }
}
