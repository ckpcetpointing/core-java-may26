package com.jsn.core.java.oops;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public boolean isVegetarian() {
        return this.getAge()> 18; // Just a dummy implementation for demonstration
    }
}
