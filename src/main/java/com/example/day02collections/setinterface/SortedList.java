package com.example.day02collections.setinterface;

import java.util.*;

public class SortedList {
    public static List<Integer> convertSetToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> unsortedSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("Sorted List: " + convertSetToSortedList(unsortedSet));
    }
}
