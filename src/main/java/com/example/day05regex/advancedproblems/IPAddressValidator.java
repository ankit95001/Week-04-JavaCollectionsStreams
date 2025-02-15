package com.example.day05regex.advancedproblems;

import java.util.regex.*;

public class IPAddressValidator {
    public static boolean isValidIPAddress(String ip) {
        String regex =
                "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}" +
                        "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testIPs = { "192.168.1.1", "255.255.255.255", "256.100.50.25", "192.168.1", "123.045.067.089" };

        for (String ip : testIPs) {
            System.out.println(ip + " → " + (isValidIPAddress(ip) ? "Valid" : "Invalid"));
        }
    }
}

