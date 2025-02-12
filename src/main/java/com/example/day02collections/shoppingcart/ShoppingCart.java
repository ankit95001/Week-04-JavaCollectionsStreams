package com.example.day02collections.shoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class ShoppingCart {
    Map<String, Double> productPrices;
    LinkedHashMap<String, Integer> cartItems;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cartItems = new LinkedHashMap<>();
    }


    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }


    public void addToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            System.out.println("Product not found!");
            return;
        }
        cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
    }


    public void displayCartItems() {
        System.out.println("Cart Items (In Order of Addition):");
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " pcs");
        }
    }


    public void displayItemsSortedByPrice() {
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            sortedByPrice.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Products Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " -> $" + entry.getKey());
        }
    }


    public void displayTotalPrice() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        System.out.println("Total Cart Price: $" + total);
    }
}