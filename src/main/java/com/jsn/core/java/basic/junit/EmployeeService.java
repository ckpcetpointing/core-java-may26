package com.jsn.core.java.basic.junit;

public class EmployeeService {

    public double calculateBonus(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        return salary * 0.20; // Bonus is 10% of the salary
    }

    public boolean isEligibleForPromotion(int yearsOfService) {
        System.out.println("Checking promotion eligibility for " + yearsOfService + " years of service");
        return yearsOfService >= 5;
    }

}
