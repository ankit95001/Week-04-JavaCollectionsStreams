package com.example.annotation.suppress;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testAddElements() {
        UncheckedWarningExample example = new UncheckedWarningExample();
        assertDoesNotThrow(example::addElements);
    }
}

