package com.example.day01generics.dynamiconlinemarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ProductCatalogTest {

    @Test
    void testAddProduct() {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        Book book = new Book("Effective Java", 45, "EDUCATIONAL");

        bookCatalog.addProduct(book);

        List<Book> books = bookCatalog.getProducts();
        assertEquals(1, books.size());
        assertEquals("Effective Java", books.get(0).getName());
    }

    @Test
    void testApplyDiscount() {
        Book book = new Book("The Alchemist", 20, "FICTION");
        Main.applyDiscount(book, 10); // 10% discount

        assertEquals(18.0, book.getPrice(), 0.01);
    }

    @Test
    void testApplyDiscountMultipleProducts() {
        Clothing shirt = new Clothing("T-Shirt", 15, "MENS");
        Gadget phone = new Gadget("Smartphone", 500, "MOBILE");

        Main.applyDiscount(shirt, 20); // 20% discount
        Main.applyDiscount(phone, 5); // 5% discount

        assertEquals(12.0, shirt.getPrice(), 0.01);
        assertEquals(475.0, phone.getPrice(), 0.01);
    }

    @Test
    void testToString() {
        Gadget laptop = new Gadget("Laptop", 1200, "LAPTOP");
        String expectedOutput = "Gadget - Name: Laptop, Price: $1200.00 Category: LAPTOP";

        assertEquals(expectedOutput, laptop.toString());
    }
}
