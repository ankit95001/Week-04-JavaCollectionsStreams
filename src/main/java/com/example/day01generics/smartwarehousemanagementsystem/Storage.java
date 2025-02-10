package com.example.day01generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getAllItems() {
        return items;
    }
}
