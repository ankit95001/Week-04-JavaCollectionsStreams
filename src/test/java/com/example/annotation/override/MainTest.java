package com.example.annotation.override;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testDogSound() {
        Animal myDog = new Dog();
        assertEquals("Bark! Bark!", getDogSound(myDog));
    }

    private String getDogSound(Animal animal) {
        return captureOutput(animal::makeSound);
    }

    private String captureOutput(Runnable methodCall) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        methodCall.run();
        System.setOut(System.out);
        return out.toString().trim();
    }
}

