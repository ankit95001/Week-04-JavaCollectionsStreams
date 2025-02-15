package com.example.day05regex.replaceandmodifystrings;

import java.util.regex.*;

public class SpaceNormalizer {
    public static String normalizeSpaces(String text) {
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(" ");
    }

    public static void main(String[] args) {
        String text = "This   is   an  example    with   multiple   spaces.";
        String result = normalizeSpaces(text);
        System.out.println("Normalized Text: \"" + result + "\"");
    }
}

