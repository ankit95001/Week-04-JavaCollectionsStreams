package com.example.reflection.createcustomobjectmapper;

public class User {
    private String name;
    private int age;
    private String email;

    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }
}

