package com.example.day02collections.insurancepolicymanagementsystem1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsurancePolicyManagement {
    Set<Policy> hashSetPolicies = new HashSet<>();
    Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Unique Policies:");
        for (Policy policy : hashSetPolicies) {
            System.out.println(policy);
        }
    }

    public void displayExpiringSoon() {
        System.out.println("Policies Expiring Soon (within 30 days):");
        LocalDate today = LocalDate.now();
        for (Policy policy : treeSetPolicies) {
            if (ChronoUnit.DAYS.between(today, policy.getExpiryDate()) <= 30) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String type) {
        System.out.println("Policies with Coverage Type: " + type);
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies() {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Policy policy : hashSetPolicies) {
            countMap.put(policy.getPolicyNumber(), countMap.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }
        System.out.println("Duplicate Policies:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Policy Number: " + entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
    }
}
