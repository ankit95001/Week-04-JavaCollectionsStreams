package com.example.day01generics.smartwarehousemanagementsystem;

import java.util.List;

public class Main {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200));
        electronicsStorage.addItem(new Electronics("Smartphone", 800));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 2));
        groceriesStorage.addItem(new Groceries("Milk", 3));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 50));
        furnitureStorage.addItem(new Furniture("Table", 150));

        System.out.println("Electronics:");
        displayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries:");
        displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture:");
        displayItems(furnitureStorage.getAllItems());
    }
}
