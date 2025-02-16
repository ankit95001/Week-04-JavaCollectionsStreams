package com.example.annotation.beginnerlevel;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class MethodCheckerTest {

    @Test
    void testAnnotationPresence() {
        Method[] methods = MethodChecker.class.getDeclaredMethods();
        boolean found = false;

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                found = true;
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                assertNotNull(annotation);
                assertTrue(annotation.level().equals("HIGH") || annotation.level().equals("MEDIUM"));
            }
        }

        assertTrue(found, "At least one method should be annotated with @ImportantMethod");
    }
}
