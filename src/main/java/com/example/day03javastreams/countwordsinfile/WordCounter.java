package com.example.day03javastreams.countwordsinfile;

import java.io.*;
import java.util.*;

public class WordCounter {
    public static Map<String, Integer> countWords(String filePath) throws IOException {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        return wordCountMap;
    }

    public static List<Map.Entry<String, Integer>> getTopWords(Map<String, Integer> wordCountMap, int topN) {
        return wordCountMap.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(topN)
                .toList();
    }

    public static void main(String[] args) {
        String filePath = "src/main/java/com/example/day03javastreams/countwordsinfile/input.txt";

        try {
            Map<String, Integer> wordCountMap = countWords(filePath);
            List<Map.Entry<String, Integer>> topWords = getTopWords(wordCountMap, 5);

            System.out.println("Top 5 most frequent words:");
            for (Map.Entry<String, Integer> entry : topWords) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}