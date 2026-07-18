package com.jsn.core.java.collection;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {


    public static void main(String[] args) {


        try(FileInputStream fis = new FileInputStream("C:\\Users\\Vijay\\code\\core-java-may26\\src\\main\\java\\com\\jsn\\core\\java\\collection\\app.properties")) {
            Properties properties = new Properties();
            properties.load(fis);

            System.out.println(properties.getProperty("jdbcurl"));

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
