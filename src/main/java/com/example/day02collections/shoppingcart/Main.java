package com.example.day02collections.shoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products with prices
        cart.addProduct("Laptop", 800);
        cart.addProduct("Phone", 500);
        cart.addProduct("Headphones", 150);
        cart.addProduct("Mouse", 50);

        // Adding items to cart
        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Mouse", 1);
        cart.addToCart("Headphones", 1);

        // Display cart details
        cart.displayCartItems();
        System.out.println();
        cart.displayItemsSortedByPrice();
        System.out.println();
        cart.displayTotalPrice();
    }
}
