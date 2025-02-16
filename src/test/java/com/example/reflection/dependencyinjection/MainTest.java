package com.example.reflection.dependencyinjection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testDependencyInjection() {
        Client client = Main.createInstance(Client.class);
        assertNotNull(client);
        assertNotNull(client.getService());
    }
}
