package com.example.day03javastreams.pipedstreams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread {
    final PipedInputStream pis;
    final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try (pis; buffer) { // Auto-closing streams
            int data;
            while ((data = pis.read()) != -1) {
                buffer.write(data);
            }
            System.out.println("Reader: Data received - " + buffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getReceivedData() {
        return buffer.toString();
    }
}

