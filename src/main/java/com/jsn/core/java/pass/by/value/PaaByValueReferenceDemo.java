package com.jsn.core.java.pass.by.value;

import lombok.AllArgsConstructor;
import lombok.Data;

public class PaaByValueReferenceDemo {

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println("Original Person before method call: " + person.getName() + ", " + person.getAge());
        modifyPerson(person); // memory address of person object is passed to the method, so changes inside the method will affect the original object
        System.out.println("Original Person after method call: " + person.getName() + ", " + person.getAge());
    }

    static void modifyPerson(Person p) {
        p.setName("Bob");
        p.setAge(25);
        System.out.println("Person inside method: " + p);
    }
}


@Data
@AllArgsConstructor
class Person {
    private String name;
    private int age;
}
