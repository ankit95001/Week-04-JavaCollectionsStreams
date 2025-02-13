package com.example.day03javastreams.bufferedstreams;

import java.io.*;

class BufferedFileCopy {
    public static void copyFileBuffered(String sourcePath, String destinationPath) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/main/java/com/example/day03javastreams/bufferedstreams/input.txt";
        String destinationPath = "src/main/java/com/example/day03javastreams/bufferedstreams/output.txt";
        try {
            copyFileBuffered(sourcePath,destinationPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
