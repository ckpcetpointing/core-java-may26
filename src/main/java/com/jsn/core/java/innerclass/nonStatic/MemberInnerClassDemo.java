package com.jsn.core.java.innerclass.nonStatic;

public class MemberInnerClassDemo {

    public static void main(String[] args) {

        MiitNotification miitNotification = new MiitNotification();// 1st create outer class object
        miitNotification.setType("EMAIL");

        MiitNotification.EmailNotification emailNotification = miitNotification.new EmailNotification(); //2nd using outer class object ref , create inner class object
        emailNotification.setToEmail("test@miit.com");

        System.out.println(emailNotification.getEmailInfo());


        System.out.println("Outer class name : "+miitNotification.getClass().getName());
        System.out.println("Inner class name : "+emailNotification.getClass().getName());


        StaticMiitNotification.StaticEmailNotification  staticEmailNotification = new StaticMiitNotification.StaticEmailNotification();

        System.out.println("Static class's method called ----"+staticEmailNotification.getEmailInfo());

    }
}
