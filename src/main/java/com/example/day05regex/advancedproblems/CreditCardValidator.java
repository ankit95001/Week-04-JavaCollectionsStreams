package com.example.day05regex.advancedproblems;

import java.util.regex.*;

public class CreditCardValidator {
    public static boolean isValidCreditCard(String cardNumber) {
        String regex = "^(4\\d{15}|5\\d{15})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testCards = { "4123456789012345", "5123456789012345", "6123456789012345", "4234567890123", "52345678901234567" };

        for (String card : testCards) {
            System.out.println(card + " → " + (isValidCreditCard(card) ? "Valid" : "Invalid"));
        }
    }
}

