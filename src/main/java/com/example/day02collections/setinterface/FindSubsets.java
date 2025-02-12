package com.example.day02collections.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        return set1.containsAll(set2);
    }

    public static void main(String[] args) {
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Is subset? " + isSubset(set1, set2));
    }
}
