package com.jsn.core.java.basic;

public class ForLoopWithBreakDemo {


    public static void main(String[] args) {
        int target = 5;

        for (int i = 0; i < 10; i++) {
            if (i == target) {
                System.out.println("Found the target number: " + target);
                continue;
            }
            System.out.println("Current number: " + i);
        }
    }
}
/**
 * Break statement o/p
 *
 * Current number: 0
 * Current number: 1
 * Current number: 2
 * Current number: 3
 * Current number: 4
 * Found the target number: 5
 */
