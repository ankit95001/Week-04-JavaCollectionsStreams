package com.example.day02collections.mapinterface;

import java.util.Collections;
import java.util.Map;

public class KeyWithHighestValue {
    public static String findKeyWithHighestValue(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Map<String, Integer> valueMap = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println("Key with Highest Value: " + findKeyWithHighestValue(valueMap));
    }
}
