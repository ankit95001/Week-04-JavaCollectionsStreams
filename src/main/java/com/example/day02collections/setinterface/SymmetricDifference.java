package com.example.day02collections.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        Set<T> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        result.removeAll(temp);

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        System.out.println("The Symmetric Difference of two list are : "+symmetricDifference(set1,set2));
    }
}
