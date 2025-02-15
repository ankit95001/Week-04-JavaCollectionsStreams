package com.example.day05regex.advancedproblems;

import java.util.regex.*;
import java.util.HashSet;
import java.util.Set;

public class RepeatingWordsFinder {
    public static Set<String> findRepeatingWords(String text) {
        text=text.toLowerCase();
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeatingWords = new HashSet<>();
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }
        return repeatingWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Set<String> repeatingWords = findRepeatingWords(text);
        System.out.println("Repeating Words: " + String.join(", ", repeatingWords));
    }
}

