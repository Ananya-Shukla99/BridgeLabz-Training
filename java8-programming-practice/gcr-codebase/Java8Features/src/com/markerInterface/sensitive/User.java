package com.markerInterface.sensitive;

public class User implements SensitiveData {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}