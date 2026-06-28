package com.jsn.core.java.clone;

import java.util.Date;

public class StudentClonningDemo {


    public static void main(String[] args) {
        Subjects subjects = new Subjects("Math", "Physics", "Chemistry");
        EngStudent originalStudent = new EngStudent("John Doe", 20, "A", new Date(), "Computer Science", subjects);
        System.out.println("Original Student: " + originalStudent);

        try {
            EngStudent clonedStudent = originalStudent.clone();
            System.out.println("Cloned Student: " + clonedStudent);
            clonedStudent.getSubjects().setSubject1("Biology"); // Modifying the subject of the cloned student
            System.out.println("After modifying cloned student's subject:");
            System.out.println("Original Student: " + originalStudent);
            System.out.println("Cloned Student: " + clonedStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }




    /*public static void main(String[] args) throws CloneNotSupportedException {
        Student originalStudent = new Student();
        originalStudent.setName("John Doe");
        originalStudent.setAge(20);
        originalStudent.setGrade("A");
        originalStudent.setEnrollmentDate(new Date());
        System.out.println("Original Student: " + originalStudent);

        Student clonedStudent = originalStudent.clone();
        System.out.println("Cloned Student: " + clonedStudent);

        Date date = clonedStudent.getEnrollmentDate();
        date.setTime(date.getTime() + 1000000000L); // Modifying the enrollment date of the cloned student


        System.out.println("After modifying cloned student's enrollment date:");
        System.out.println("Original Student: " + originalStudent);
        System.out.println("Cloned Student: " + clonedStudent);



    }*/
}

