package com.example.day05regex.validatelicenseplate;

import java.util.regex.*;

public class LicensePlateValidator {
    public static boolean isValidLicensePlate(String plate) {
        String regex = "^[A-Z]{2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(plate);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testPlates = {"AB1234", "A12345", "XY9876", "abc1234", "ZZ0000", "A1234", "AB12"};

        for (String plate : testPlates) {
            System.out.println("License Plate: " + plate + " -> " + (isValidLicensePlate(plate) ? "Valid" : "Invalid"));
        }
    }
}

