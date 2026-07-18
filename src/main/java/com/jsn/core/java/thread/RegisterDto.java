package com.jsn.core.java.thread;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.time.StopWatch;

@Data
@AllArgsConstructor
public class RegisterDto {

    private String name;
    private String email;
    private String phoneNumber;
    StopWatch stopWatch;
}
