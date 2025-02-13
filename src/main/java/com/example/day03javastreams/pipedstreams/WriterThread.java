package com.example.day03javastreams.pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {
    final PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (pos) { // Auto-closing stream
            String message = "Hello from WriterThread!";
            pos.write(message.getBytes());
            System.out.println("Writer: Data written to pipe.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}