package com.example.day05regex.replaceandmodifystrings;

import java.util.regex.*;
import java.util.Arrays;
import java.util.List;

public class BadWordCensor {
    public static String censorBadWords(String text, List<String> badWords) {
        for (String word : badWords) {
            String regex = "\\b" + Pattern.quote(word) + "\\b";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            text = matcher.replaceAll("****");
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid","idiot");

        String censoredText = censorBadWords(text, badWords);
        System.out.println("Censored Text: " + censoredText);
    }
}

