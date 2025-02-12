package com.example.day02collections.insurancepolicymanagementsystem1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManagement manager = new InsurancePolicyManagement();

        Policy p1 = new Policy(101, "Ankit", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(102, "Aakrati", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy(103, "Anand", LocalDate.now().plusDays(20), "Home", 7000);
        Policy p4 = new Policy(101, "Avinash", LocalDate.now().plusDays(10), "Health", 5000);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverageType("Health");
        manager.findDuplicatePolicies();

        // Performance comparison
        System.out.println("\nPerformance Comparison:");
        long start, end;

        // HashSet Performance
        start = System.nanoTime();
        manager.hashSetPolicies.contains(p2);
        end = System.nanoTime();
        System.out.println("HashSet Lookup Time: " + (end - start) + " ns");

        // LinkedHashSet Performance
        start = System.nanoTime();
        manager.linkedHashSetPolicies.contains(p2);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Lookup Time: " + (end - start) + " ns");

        // TreeSet Performance
        start = System.nanoTime();
        manager.treeSetPolicies.contains(p2);
        end = System.nanoTime();
        System.out.println("TreeSet Lookup Time: " + (end - start) + " ns");
    }
}
