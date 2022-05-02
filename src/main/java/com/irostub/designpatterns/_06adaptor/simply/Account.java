package com.irostub.designpatterns._06adaptor.simply;

import java.util.Date;

public class Account implements UserDetails{
    private String username;
    private String password;
    private String email;
    private String phone;
    private Date createdAt;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
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
