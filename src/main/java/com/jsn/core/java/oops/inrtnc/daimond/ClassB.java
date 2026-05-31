package com.jsn.core.java.oops.inrtnc.daimond;

public class ClassB implements InterfaceA1, InterfaceA2 {

    @Override
    public void display() {
        //call InterfaceA1's display method
        InterfaceA2.super.display();
    }

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.display(); // This will call the overridden display method in ClassB
    }
}
