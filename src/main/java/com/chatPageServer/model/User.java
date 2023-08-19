package com.chatPageServer.model;

public class User {
    String username;
    String password;

    public User() {
    }

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
