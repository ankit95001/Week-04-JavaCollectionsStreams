package com.example.day02collections.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        cart.addProduct("Laptop", 800);
        cart.addProduct("Phone", 500);
        cart.addProduct("Headphones", 150);
        cart.addProduct("Mouse", 50);
    }

    @Test
    void testAddProduct() {
        cart.addProduct("Tablet", 300);
        assertTrue(cart.productPrices.containsKey("Tablet"));
        assertEquals(300, cart.productPrices.get("Tablet"));
    }

    @Test
    void testAddToCart() {
        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);

        assertEquals(1, cart.cartItems.get("Laptop"));
        assertEquals(2, cart.cartItems.get("Phone"));
    }

    @Test
    void testAddToCartProductNotFound() {
        cart.addToCart("Tablet", 1);
        assertFalse(cart.cartItems.containsKey("Tablet"));
    }

    @Test
    void testDisplayTotalPrice() {
        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Mouse", 1);
        cart.addToCart("Headphones", 1);

        double expectedTotal = (800 * 1) + (500 * 2) + (50 * 1) + (150 * 1);
        assertEquals(expectedTotal, cart.cartItems.entrySet().stream()
                .mapToDouble(entry -> cart.productPrices.get(entry.getKey()) * entry.getValue()).sum());
    }
}
