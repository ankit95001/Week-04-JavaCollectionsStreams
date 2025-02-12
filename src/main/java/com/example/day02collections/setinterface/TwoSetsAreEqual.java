package com.example.day02collections.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSetsAreEqual {
    public static <T> boolean check(Set<T> set1, Set<T> set2){
        for(T item:set1){
            if(!set2.contains(item)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));

        System.out.println("The statement both list are equal is : "+check(set1,set2));
    }
}
