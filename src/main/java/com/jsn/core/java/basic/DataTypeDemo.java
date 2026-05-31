package com.jsn.core.java.basic;

public class DataTypeDemo {

    public static void main(String[] args) {
        //Primitive Data Types
        int age = 30; // integer
        double salary = 50000.50; // double
        char grade = 'A'; // character
        boolean isEmployed = true; // boolean
        long population = 7800000000L; // long
        float pi = 3.14f; // float


        char gender_m = 'M'; // char
        char gender_f = 'F'; // char

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Employed: " + isEmployed);
        System.out.println("Population: " + population);
        System.out.println("Value of Pi: " + pi);

        //Reference Data Types
        String name = "John Doe"; // String is a reference type
        int[] numbers = {1, 2, 3, 4, 5}; // Array is a reference type

        System.out.println("Name: " + name);
        System.out.print("Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
