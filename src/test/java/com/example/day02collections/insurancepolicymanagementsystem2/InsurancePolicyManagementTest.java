package com.example.day02collections.insurancepolicymanagementsystem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InsurancePolicyManagementTest {
    private InsurancePolicyManagement manager;
    private Policy policy1, policy2, policy3, policy4;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManagement();

        policy1 = new Policy(101, "Ankit", LocalDate.now().plusDays(10), "Health", 5000);
        policy2 = new Policy(102, "Aakrati", LocalDate.now().plusDays(40), "Auto", 3000);
        policy3 = new Policy(103, "Anand", LocalDate.now().plusDays(20), "Home", 7000);
        policy4 = new Policy(104, "Avinash", LocalDate.now().minusDays(5), "Health", 4500);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);
    }

    @Test
    void testAddPolicy() {
        Policy policy5 = new Policy(105, "Alice", LocalDate.now().plusDays(15), "Auto", 6000);
        manager.addPolicy(policy5);

        assertNotNull(manager.getPolicyByNumber(105));
        assertEquals("Alice", manager.getPolicyByNumber(105).getPolicyholderName());
    }

    @Test
    void testGetPolicyByNumber() {
        assertEquals(policy1, manager.getPolicyByNumber(101));
        assertNull(manager.getPolicyByNumber(999)); // Non-existing policy
    }

    @Test
    void testListExpiringPolicies() {
        // Expecting only policies that expire within 30 days (policy1 and policy3)
        assertTrue(manager.treeMapPolicies.containsKey(policy1.getExpiryDate()));
        assertTrue(manager.treeMapPolicies.containsKey(policy3.getExpiryDate()));
        assertFalse(manager.treeMapPolicies.containsKey(policy2.getExpiryDate())); // Expires after 40 days
    }

    @Test
    void testListPoliciesByHolder() {
        // Policy for "Ankit" exists
        assertEquals("Ankit", manager.getPolicyByNumber(101).getPolicyholderName());

        // Policy for "Alice" doesn't exist
        assertFalse(manager.hashMapPolicies.values().stream().anyMatch(p -> p.getPolicyholderName().equals("Alice")));
    }

    @Test
    void testRemoveExpiredPolicies() {
        manager.removeExpiredPolicies();

        // Expired policy (policy4) should be removed
        assertNull(manager.getPolicyByNumber(104));

        // Policies with future expiry should remain
        assertNotNull(manager.getPolicyByNumber(101));
        assertNotNull(manager.getPolicyByNumber(102));
    }

    @Test
    void testDisplayAllPolicies() {
        Map<Integer, Policy> policies = manager.hashMapPolicies;
        assertEquals(4, policies.size());

        manager.removeExpiredPolicies();
        assertEquals(3, policies.size()); // One policy removed
    }
}
