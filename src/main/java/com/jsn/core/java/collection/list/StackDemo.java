package com.jsn.core.java.collection.list;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push(null);
        stack.push(null);
        System.out.println(stack);
    }
}
