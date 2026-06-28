package com.jsn.core.java.exception;

public class CustomClass implements AutoCloseable {

    public void test(){
        System.out.println("Inside test method of CustomClass");
    }


    @Override
    public void close() throws Exception {
        System.out.println("Closing CustomClass resource...............................");
    }
}
