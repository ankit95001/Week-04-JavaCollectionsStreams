package com.example.day03javastreams.readlargefile;

import java.io.*;

public class LargeFileReader {
    public static void readLargeFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "src/main/java/com/example/day03javastreams/readlargefile/input.txt";

        try {
            readLargeFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
