package com.jsn.core.java.oops.abstraction.interview;

public class InterviewDemo {

    public static void main(String[] args) {
        MyParentClass p  = new MyChildClass1();

        if (p instanceof MyChildClass1) {
            MyChildClass1 c = (MyChildClass1) p;
            c.method3();
        } else {
            System.out.println("The object is not an instance of MyChildClass1.");
        }

    }
}
