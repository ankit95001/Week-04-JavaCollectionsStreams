package com.example.day02collections.queueinterface;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class HospitalTriageSystemTest {

    @Test
    void testHospitalTriage() {
        List<HospitalTriageSystem.Patient> patients = Arrays.asList(
                new HospitalTriageSystem.Patient("John", 3),
                new HospitalTriageSystem.Patient("Alice", 5),
                new HospitalTriageSystem.Patient("Bob", 2)
        );
        List<String> result = HospitalTriageSystem.hospitalTriage(patients);
        assertEquals(List.of("Alice", "John", "Bob"), result);
    }

    @Test
    void testHospitalTriageSinglePatient() {
        List<HospitalTriageSystem.Patient> patients = List.of(
                new HospitalTriageSystem.Patient("Emma", 4)
        );
        List<String> result = HospitalTriageSystem.hospitalTriage(patients);
        assertEquals(List.of("Emma"), result);
    }

    @Test
    void testHospitalTriageEmptyList() {
        List<HospitalTriageSystem.Patient> patients = List.of();
        List<String> result = HospitalTriageSystem.hospitalTriage(patients);
        assertTrue(result.isEmpty());
    }

    @Test
    void testHospitalTriageSameSeverity() {
        List<HospitalTriageSystem.Patient> patients = Arrays.asList(
                new HospitalTriageSystem.Patient("David", 3),
                new HospitalTriageSystem.Patient("Sophia", 3),
                new HospitalTriageSystem.Patient("Ethan", 3)
        );
        List<String> result = HospitalTriageSystem.hospitalTriage(patients);
        assertEquals(3, result.size());
        assertTrue(result.containsAll(List.of("David", "Sophia", "Ethan")));
    }
}
