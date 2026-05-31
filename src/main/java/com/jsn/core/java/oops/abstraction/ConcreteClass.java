package com.jsn.core.java.oops.abstraction;

public class ConcreteClass extends AbstractClass {

    ConcreteClass() {
        System.out.println("Concrete class constructor called.");
    }

    @Override
    void abstractMethod() {
        System.out.println("Implementation of the abstract method in the concrete class.");
    }
}
