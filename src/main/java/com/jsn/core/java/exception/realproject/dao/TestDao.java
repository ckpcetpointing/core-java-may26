package com.jsn.core.java.exception.realproject.dao;

import java.sql.SQLException;

public class TestDao {

    public void callDB() throws SQLException {
            System.out.println("TestDao:callDB.....");
            throw new SQLException();
    }
}
