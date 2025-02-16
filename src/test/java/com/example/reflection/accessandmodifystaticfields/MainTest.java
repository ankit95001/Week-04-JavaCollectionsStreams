package com.example.reflection.accessandmodifystaticfields;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testModifyStaticField() {
        try {
            Main.modifyStaticField();
            assertEquals("NEW_API_KEY", Configuration.getApiKey());

        } catch (Exception e) {
            fail("Reflection failed");
        }
    }
}

