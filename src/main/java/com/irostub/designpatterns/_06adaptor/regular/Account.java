package com.irostub.designpatterns._06adaptor.regular;

import java.util.Date;

public class Account {
    private String username;
    private String password;
    private String email;
    private String phone;
    private Date createdAt;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
