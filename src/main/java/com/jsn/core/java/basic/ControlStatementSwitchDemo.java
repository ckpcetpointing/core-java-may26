package com.jsn.core.java.basic;

public class ControlStatementSwitchDemo {
    public static void main(String[] args) {
        int dayOfWeek = 3; // Example: 1 for Monday, 2 for Tuesday, ..., 7 for Sunday
        printDayOfWeek(dayOfWeek);
    }

    private static void printDayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week. Please enter a number between 1 and 7.");
        }
    }
}
