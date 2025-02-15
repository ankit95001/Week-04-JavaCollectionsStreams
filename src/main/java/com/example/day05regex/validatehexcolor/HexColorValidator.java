package com.example.day05regex.validatehexcolor;

import java.util.regex.*;

public class HexColorValidator {
    public static boolean isValidHexColor(String color) {
        String regex = "^#([A-Fa-f0-9]{6})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(color);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testColors = {"#FFA500", "#ff4500", "#123", "#FFFFFF", "#000000", "#GHIJKL", "#12AB34", "123456"};

        for (String color : testColors) {
            System.out.println("Hex Color: " + color + " -> " + (isValidHexColor(color) ? "Valid" : "Invalid"));
        }
    }
}

