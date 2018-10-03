package com.runninplugins.runninperms.databases;

public enum DriverUrls {
    SQLITE("jdbc:sqlite:%s.db");


    private String url;

    DriverUrls(String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }
}
