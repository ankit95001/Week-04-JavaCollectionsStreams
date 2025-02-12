package com.example.day02collections.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static Map<String, Integer> wordFrequencyCounter(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = text.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println("Word Frequency: " + wordFrequencyCounter(text));
    }
}
