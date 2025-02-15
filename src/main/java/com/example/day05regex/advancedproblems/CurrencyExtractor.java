package com.example.day05regex.advancedproblems;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyExtractor {
    public static List<String> extractCurrencyValues(String text) {
        String regex = "\\$\\d+(\\.\\d{2})?"; // Matches currency values like $45.99 or 10.50
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> currencyValues = new ArrayList<>();
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }
        return currencyValues;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the $10 discount is $10.50.";
        List<String> values = extractCurrencyValues(text);
        System.out.println("Extracted Currency Values: " + values);
    }
}

