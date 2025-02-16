package com.example.annotation.advancedlevel;


import com.example.annotation.advancedlevel.serializationannotation.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testJsonSerialization() {
        User user = new User("Alice", 30);
        String expectedJson = "{\"user_name\": \"Alice\", \"user_age\": \"30\"}";
        assertEquals(expectedJson, user.toJson());
    }
}

