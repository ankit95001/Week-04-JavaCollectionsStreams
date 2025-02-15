package com.example.day05junit.basicjunittest;

public class StringUtils {

    // Method to reverse a string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed); // Case-insensitive check
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        StringUtils utils = new StringUtils();

        System.out.println("Reverse of 'hello': " + utils.reverse("hello"));
        System.out.println("Is 'madam' a palindrome? " + utils.isPalindrome("madam"));
        System.out.println("Uppercase of 'world': " + utils.toUpperCase("world"));
    }
}

