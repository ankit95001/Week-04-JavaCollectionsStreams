package com.example.reflection.createcustomobjectmapper;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testToObject() {
        Map<String, Object> userData = Map.of(
                "name", "Ankit",
                "age", 20,
                "email", "Ankit@example.com"
        );

        User user = Main.toObject(User.class, userData);
        assertNotNull(user);
        assertEquals("Name: Ankit, Age: 20, Email: Ankit@example.com", user.getDetails());
    }

    @Test
    void testInvalidFieldIgnored() {
        Map<String, Object> userData = Map.of(
                "name", "Bob",
                "age", 28,
                "unknownField", "This should be ignored"
        );

        User user = Main.toObject(User.class, userData);
        assertNotNull(user);
        assertEquals("Name: Bob, Age: 28, Email: null", user.getDetails());
    }
}
