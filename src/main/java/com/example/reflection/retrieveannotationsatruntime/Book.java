package com.example.reflection.retrieveannotationsatruntime;

@Author(name = "Ankit kumar")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

