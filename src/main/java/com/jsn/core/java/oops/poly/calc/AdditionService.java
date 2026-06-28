package com.jsn.core.java.oops.poly.calc;

public class AdditionService {


    public int add(int a, double b) throws RuntimeException {
        return a + new Double(b).intValue();
    }

    protected int add(double a, int b) {
        return new Double(a).intValue() + b;
    }

    public int add(double a, int b, double c) {
        int result = add(a, b);
        return result + new Double(c).intValue();
    }


    public static void main(String[] args) {
        AdditionService additionService = new AdditionService();
        System.out.println(additionService.add(10, 20.5));
        additionService.add(10.5, 20);
    }
}
