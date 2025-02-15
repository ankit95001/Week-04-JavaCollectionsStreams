package com.example.day05regex.extractionproblems;

import java.util.regex.*;
import java.util.ArrayList;

public class LinkExtractor {
    public static ArrayList<String> extractLinks(String text) {
        String regex = "\\bhttps?://(www\\.)?([a-zA-Z0-9.-]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info. Also, check https://github.com/user/repo.";

        ArrayList<String> links = extractLinks(text);
        System.out.println("Extracted Links: " + links);
    }
}

