package com.jsn.core.java.imtbl;

import java.util.ArrayList;

public final class DataBaseConfig {

    private final String url;
    private final String username;
    private final String password;
    private final ArrayList<String> connectionProperties;

    public DataBaseConfig(String url, String username, String password, ArrayList<String> connectionProperties) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.connectionProperties = new ArrayList<>(connectionProperties);
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<String> getConnectionProperties() {
        //return (ArrayList<String>) connectionProperties.clone();
        return new ArrayList<>(connectionProperties);
    }
}
