package com.example.day02collections.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> merged = new HashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (merged.containsKey(key)) {
                merged.put(key, merged.get(key) + value);
            } else {
                merged.put(key, value);
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        System.out.println("Merged Maps: " + mergeMaps(map1, map2));
    }
}
