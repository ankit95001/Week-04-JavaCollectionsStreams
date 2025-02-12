package com.example.day02collections.insurancepolicymanagementsystem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class InsurancePolicyManagementTest {
    private InsurancePolicyManagement manager;
    private Policy p1, p2, p3, p4;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManagement();
        p1 = new Policy(101, "Ankit", LocalDate.now().plusDays(10), "Health", 5000);
        p2 = new Policy(102, "Aakrati", LocalDate.now().plusDays(40), "Auto", 3000);
        p3 = new Policy(103, "Anand", LocalDate.now().plusDays(20), "Home", 7000);
        p4 = new Policy(101, "Avinash", LocalDate.now().plusDays(10), "Health", 5000);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);
    }

    @Test
    void testAddPolicy() {
        assertEquals(3, manager.hashSetPolicies.size());
        assertEquals(3, manager.linkedHashSetPolicies.size());
        assertEquals(3, manager.treeSetPolicies.size());
    }

    @Test
    void testDisplayExpiringSoon() {
        assertTrue(manager.treeSetPolicies.contains(p1));
        assertTrue(manager.treeSetPolicies.contains(p3));
    }

    @Test
    void testFindDuplicatePolicies() {
        assertEquals(1, manager.hashSetPolicies.stream().filter(p -> p.getPolicyNumber() == 101).count());
    }

    @Test
    void testPerformanceLookup() {
        long start, end;
        start = System.nanoTime();
        boolean hashSetContains = manager.hashSetPolicies.contains(p2);
        end = System.nanoTime();
        System.out.println("HashSet Lookup Time: " + (end - start) + " ns");
        assertTrue(hashSetContains);
    }
}
