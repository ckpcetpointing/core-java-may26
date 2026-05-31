package com.jsn.core.java.basic;

public class OperatorDemo2 {

    static boolean isEligibleToVote = false;
    public static void main(String[] args) {
        //Assignment Operators 1 examples
        int a = 10; // assignment operator
        a += 5; // equivalent to a = a + 5
        System.out.println("Value of a after += 5: " + a); // 15

        //Unary Operators 1 examples
        int b = 5;
        System.out.println("Value of b: " + b); // 5
        System.out.println("Value of b after post-increment: " + b++); // 5 (returns b then increments)  //after sout value of b=6
        System.out.println("Value of b after post-increment: " + b); // 6 (b is now 6)
        System.out.println("Value of b after pre-increment: " + ++b); // 7 (increments b then returns)


        //Ternary Operator example
        int age = 10;
        isEligibleToVote = (age >= 18) ? true : false;
        System.out.println("Is eligible to vote: " + isEligibleToVote); // true

        //bitwise operator example
        int x = 5; // in binary: 0101
        int y = 3; // in binary: 0011
        int result = x & y; // bitwise AND: 0001 (1 in decimal)
        System.out.println("Bitwise AND of x and y: " + result); //

    }
}
