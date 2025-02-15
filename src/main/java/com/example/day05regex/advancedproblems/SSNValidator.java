package com.example.day05regex.advancedproblems;

import java.util.regex.*;

public class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String ssn1 = "123-45-6789";
        String ssn2 = "123456789";
        String ssn3 = "12-345-6789";
        String ssn4 = "123-456-789";

        System.out.println("\"" + ssn1 + "\" is " + (isValidSSN(ssn1) ? "valid " : "invalid"));
        System.out.println("\"" + ssn2 + "\" is " + (isValidSSN(ssn2) ? "valid " : "invalid"));
        System.out.println("\"" + ssn3 + "\" is " + (isValidSSN(ssn3) ? "valid " : "invalid"));
        System.out.println("\"" + ssn4 + "\" is " + (isValidSSN(ssn4) ? "valid " : "invalid"));
    }
}

