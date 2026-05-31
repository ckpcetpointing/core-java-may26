package com.jsn.core.java.oops;

public class ObjectDemo {

    public static void main(String[] args) {


        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 10);

        System.out.println("Person 1: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
