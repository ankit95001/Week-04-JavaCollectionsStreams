package com.example.day02collections.listinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyElements {
    public static <K> Map<K, Integer> countFrequency(List<K> list) {
        Map<K, Integer> frequencyMap = new HashMap<>();
        for (K item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Frequency Map: " + countFrequency(words));

        List<Integer> numbers = Arrays.asList(1,2,1,2,5,1,2,4,5,2,3);
        System.out.println("Frequency Map: " + countFrequency(numbers));
    }
}
