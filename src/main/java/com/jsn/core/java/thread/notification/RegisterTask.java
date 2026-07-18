package com.jsn.core.java.thread.notification;

import com.jsn.core.java.thread.RegisterDto;

import java.time.LocalTime;

public class RegisterTask implements Runnable{

    RegisterDto registerDto;


    public RegisterTask(RegisterDto registerDto){
        this.registerDto = registerDto;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" <==ThreadName*****Registration started for user : "+registerDto.getName());
        System.out.println("Task started at time : "+ LocalTime.now());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Registration done for user : "+registerDto.getName());

    }
}
