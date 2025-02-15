package com.example.day05junit.advancedjunitpracticeproblems;

import java.util.regex.*;
import java.text.ParseException;

public class DateFormatter {

    public static String formatDate(String inputDate) throws ParseException {
        String regex = "^(\\d{4})-(\\d{2})-(\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputDate);

        if (matcher.matches()) {
            return matcher.group(3) + "-" + matcher.group(2) + "-" + matcher.group(1);
        } else {
            throw new ParseException("Invalid date format", 0);
        }
    }

    public static void main(String[] args) {
        try {
            String formattedDate = formatDate("2025-02-15");
            System.out.println("Formatted Date: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
    }
}


