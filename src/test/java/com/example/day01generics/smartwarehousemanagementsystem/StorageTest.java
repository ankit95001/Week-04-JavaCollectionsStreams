package com.example.day01generics.smartwarehousemanagementsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class StorageTest {
    private Storage<Electronics> electronicsStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

    @BeforeEach
    void setUp() {
        electronicsStorage = new Storage<>();
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();
    }

    @Test
    void testAddAndRetrieveElectronics() {
        Electronics laptop = new Electronics("Laptop", 1200);
        Electronics smartphone = new Electronics("Smartphone", 800);
        electronicsStorage.addItem(laptop);
        electronicsStorage.addItem(smartphone);

        List<Electronics> items = electronicsStorage.getAllItems();
        assertEquals(2, items.size());
        assertEquals("Laptop", items.get(0).getName());
        assertEquals(1200, items.get(0).getPrice());
        assertEquals("Smartphone", items.get(1).getName());
    }

    @Test
    void testAddAndRetrieveGroceries() {
        Groceries apple = new Groceries("Apple", 2);
        Groceries milk = new Groceries("Milk", 3);
        groceriesStorage.addItem(apple);
        groceriesStorage.addItem(milk);

        List<Groceries> items = groceriesStorage.getAllItems();
        assertEquals(2, items.size());
        assertEquals("Apple", items.get(0).getName());
        assertEquals(2, items.get(0).getPrice());
        assertEquals("Milk", items.get(1).getName());
    }

    @Test
    void testAddAndRetrieveFurniture() {
        Furniture chair = new Furniture("Chair", 50);
        Furniture table = new Furniture("Table", 150);
        furnitureStorage.addItem(chair);
        furnitureStorage.addItem(table);

        List<Furniture> items = furnitureStorage.getAllItems();
        assertEquals(2, items.size());
        assertEquals("Chair", items.get(0).getName());
        assertEquals(50, items.get(0).getPrice());
        assertEquals("Table", items.get(1).getName());
    }

    @Test
    void testStorageInitiallyEmpty() {
        assertTrue(electronicsStorage.getAllItems().isEmpty());
        assertTrue(groceriesStorage.getAllItems().isEmpty());
        assertTrue(furnitureStorage.getAllItems().isEmpty());
    }
}
