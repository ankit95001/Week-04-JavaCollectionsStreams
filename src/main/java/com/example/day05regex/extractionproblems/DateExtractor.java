package com.example.day05regex.extractionproblems;

import java.util.regex.*;
import java.util.ArrayList;

public class DateExtractor {
    public static ArrayList<String> extractDates(String text) {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        ArrayList<String> dates = extractDates(text);
        System.out.println("Extracted Dates: " + dates);
    }
}

