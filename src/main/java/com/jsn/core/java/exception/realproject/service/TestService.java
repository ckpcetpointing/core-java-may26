package com.jsn.core.java.exception.realproject.service;

import com.jsn.core.java.exception.realproject.dao.TestDao;

import java.sql.SQLException;

public class TestService {

    public void service() throws SQLException {
        TestDao testDao = new TestDao();
        testDao.callDB();
    }
}
