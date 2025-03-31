package com.commerce.testdev.Entity;

import jakarta.persistence.EmbeddedId;

public class User {

    @EmbeddedId
    private UniqueUser uniqueUser_id;


    String password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
