package com.example.day05regex.extractionproblems;

import java.util.regex.*;
import java.util.ArrayList;

public class EmailExtractor {
    public static ArrayList<String> extractEmails(String text) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org for more details.";

        ArrayList<String> emails = extractEmails(text);
        System.out.println("Extracted Emails:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}

