package com.example.day01generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
    }
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Book("Effective Java", 45, "EDUCATIONAL"));
        bookCatalog.addProduct(new Book("The Alchemist", 20, "FICTION"));

        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 15, "MENS"));
        clothingCatalog.addProduct(new Clothing("Dress", 40, "WOMENS"));

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartphone", 500, "MOBILE"));
        gadgetCatalog.addProduct(new Gadget("Laptop", 1200, "LAPTOP"));

        // Applying discounts
        applyDiscount(bookCatalog.getProducts().get(0), 10);
        applyDiscount(clothingCatalog.getProducts().get(1), 15);
        applyDiscount(gadgetCatalog.getProducts().get(0), 5);

        // Display products after discount
        System.out.println("Books:");
        bookCatalog.getProducts().forEach(System.out::println);

        System.out.println("\nClothing:");
        clothingCatalog.getProducts().forEach(System.out::println);

        System.out.println("\nGadgets:");
        gadgetCatalog.getProducts().forEach(System.out::println);



    }
}
