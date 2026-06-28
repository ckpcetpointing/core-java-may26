package com.jsn.core.java.oops.poly.calc;

public class MultiplicationService {


        public int multiply(int a, int b, int c) {
            System.out.println("MultiplicationService.multiply(int a, int b, int c) called");
            return a * b * c;
        }

        public int multiply(long a, long b) {
            System.out.println("MultiplicationService.multiply(long a, long b) called");
            return new Long(a).intValue() * new Long(b).intValue();
        }


    public static void main(String[] args) {
        MultiplicationService multiplicationService = new MultiplicationService();
        multiplicationService.multiply(10, 20);
    }
}
