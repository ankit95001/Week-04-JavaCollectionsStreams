package com.example.day02collections.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static <T> void reverseArrayList(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static <T> void reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> tempList = new LinkedList<>();
        for (T item : list) {
            tempList.addFirst(item);
        }
        list.clear();
        list.addAll(tempList);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        List<String> stringList = new ArrayList<>(Arrays.asList("Ankit kumar","Anand Soni", "Aakrati Barsaiyan"));
        reverseArrayList(stringList);
        System.out.println("Reversed ArrayList: " + stringList);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);

        List<String> linkedStringList = new ArrayList<>(Arrays.asList("Ankit kumar","Anand Soni", "Aakrati Barsaiyan"));
        reverseArrayList(linkedStringList);
        System.out.println("Reversed Linkedlist: " + linkedStringList);

    }
}
