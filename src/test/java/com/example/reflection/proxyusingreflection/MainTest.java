package com.example.reflection.proxyusingreflection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testProxyLogging() {
        Greeting greeting = Main.createLoggingProxy(new GreetingImpl());
        String response = greeting.sayHello("Bob");

        assertEquals("Hello, Bob!", response);
    }
}

