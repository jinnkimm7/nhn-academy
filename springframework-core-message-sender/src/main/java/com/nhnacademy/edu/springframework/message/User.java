package com.nhnacademy.edu.springframework.message;

public class User {
    final private String email;
    final private String phoneNumber;

    public User(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    String getEmail() {
        return this.email;
    }
    String getPhoneNumber() {
        return this.phoneNumber;
    }
}