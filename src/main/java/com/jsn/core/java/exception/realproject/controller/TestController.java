package com.jsn.core.java.exception.realproject.controller;

import com.jsn.core.java.exception.realproject.service.TestService;

import java.sql.SQLException;

public class TestController {


    public static void main(String[] args) {

        try {
            TestService testService = new TestService();
            testService.service();
        } catch (SQLException e) {
            System.err.println("SQLException while calling the TestController's <service> method....");
            e.printStackTrace();
        }

    }
}
