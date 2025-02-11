package com.example.day01generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return new ArrayList<>(products);
    }
}

