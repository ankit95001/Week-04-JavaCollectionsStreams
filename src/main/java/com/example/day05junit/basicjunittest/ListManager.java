package com.example.day05junit.basicjunittest;

import java.util.List;

public class ListManager {
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ListManager manager = new ListManager();
        List<Integer> numbers = new java.util.ArrayList<>();

        manager.addElement(numbers, 10);
        manager.addElement(numbers, 20);
        System.out.println("List after additions: " + numbers);

        manager.removeElement(numbers, 10);
        System.out.println("List after removal: " + numbers);

        System.out.println("List size: " + manager.getSize(numbers));
    }
}

