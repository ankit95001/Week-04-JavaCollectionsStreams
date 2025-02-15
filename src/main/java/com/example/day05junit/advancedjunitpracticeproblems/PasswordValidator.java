package com.example.day05junit.advancedjunitpracticeproblems;

import java.util.regex.Pattern;

public class PasswordValidator {

    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_REGEX);

    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        String[] testPasswords = {"Pass1234", "weakpass", "12345678", "Short1", "StrongP@ss1"};

        for (String password : testPasswords) {
            System.out.println("Password: " + password + " | Valid: " + isValidPassword(password));
        }
    }
}

