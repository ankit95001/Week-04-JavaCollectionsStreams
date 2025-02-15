package com.example.day05regex.advancedproblems;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageExtractor {
    public static List<String> extractLanguages(String text) {
        String regex = "\\b(JavaScript|Java|Python|C\\+\\+|C#|Go|Ruby|Swift|PHP|Kotlin|TypeScript|Rust|Perl)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = extractLanguages(text);
        System.out.println("Extracted Languages: " + String.join(", ", languages));
    }
}

