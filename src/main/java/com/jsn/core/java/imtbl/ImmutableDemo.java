package com.jsn.core.java.imtbl;

import java.util.ArrayList;

public class ImmutableDemo {

    public static void main(String[] args) {

        ArrayList<String> connectionProperties =  new ArrayList<>();
        connectionProperties.add("useSSL=false");
        connectionProperties.add("serverTimezone=UTC");
        connectionProperties.add("allowPublicKeyRetrieval=true");

        DataBaseConfig config = new DataBaseConfig(
                "jdbc:mysql://localhost:3306/mydb",
                "admin",
                "password123",
                connectionProperties);

        String dbUrl = config.getUrl();
        System.out.println("Database URL: " + dbUrl);
        dbUrl = "jdbc:mysql://localhost:3306/otherdb";

        String againDbURL = config.getUrl();
        System.out.println("Modified Database URL: " + againDbURL);

       ArrayList<String> connProps = config.getConnectionProperties();
        System.out.println("Connection Properties: " + connProps);
       connProps.add("newProperty=value");

        ArrayList<String> connProps2 = config.getConnectionProperties();
        System.out.println("Connection Properties after modification: " + connProps2);



    }
}
