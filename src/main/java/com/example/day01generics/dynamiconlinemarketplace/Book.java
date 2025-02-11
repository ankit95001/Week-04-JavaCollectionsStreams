package com.example.day01generics.dynamiconlinemarketplace;

class Book extends Product {
    private String category;

    public Book(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return super.toString()+" Category: "+getCategory();
    }
}
