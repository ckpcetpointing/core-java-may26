package com.jsn.core.java.clone;


import lombok.*;


@Data
@AllArgsConstructor
public class Subjects implements Cloneable {
    private String subject1;
    private String subject2;
    private String subject3;

    @Override
    protected Subjects clone() throws CloneNotSupportedException {
        return (Subjects)super.clone();
    }
}
