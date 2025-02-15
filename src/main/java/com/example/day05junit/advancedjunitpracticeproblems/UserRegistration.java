package com.example.day05junit.advancedjunitpracticeproblems;

import java.util.regex.Pattern;

public class UserRegistration {

    public static String registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters, include one uppercase letter, and one digit");
        }
        return "User registered successfully";
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }

    private static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        return Pattern.matches(passwordRegex, password);
    }

    public static void main(String[] args) {
        try {
            System.out.println(registerUser("Aakrati", "aakrati@example.com", "Secure123"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
