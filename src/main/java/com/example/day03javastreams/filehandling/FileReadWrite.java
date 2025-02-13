package com.example.day03javastreams.filehandling;

import java.io.*;

public class FileReadWrite {
    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Source file does not exist");
        }

        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/main/java/com/example/day03javastreams/filehandling/input.txt";
        String destinationPath = "src/main/java/com/example/day03javastreams/filehandling/output.txt";
        try {
            copyFile(sourcePath,destinationPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
