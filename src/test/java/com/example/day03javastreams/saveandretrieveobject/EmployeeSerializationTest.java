package com.example.day03javastreams.saveandretrieveobject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

class EmployeeSerializationTest {
    private static final String TEST_FILE = "src/test/java/com/example/day03javastreams/saveandretrieveobject/test_employees.ser";

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testSerializationAndDeserialization() throws IOException, ClassNotFoundException {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ankit", "HR", 50000),
                new Employee(2, "Aakrati", "IT", 60000)
        );

        EmployeeSerialization.serializeEmployees(employees, TEST_FILE);
        assertTrue(Files.exists(Paths.get(TEST_FILE)));

        List<Employee> deserializedEmployees = EmployeeSerialization.deserializeEmployees(TEST_FILE);
        assertNotNull(deserializedEmployees);
        assertEquals(2, deserializedEmployees.size());
        assertEquals("Alice", deserializedEmployees.get(0).toString().split(",")[1].split("=")[1].replace("'", ""));
        assertEquals("Bob", deserializedEmployees.get(1).toString().split(",")[1].split("=")[1].replace("'", ""));
    }
}

