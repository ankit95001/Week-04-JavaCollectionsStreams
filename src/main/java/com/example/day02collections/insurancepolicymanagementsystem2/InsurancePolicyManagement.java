package com.example.day02collections.insurancepolicymanagementsystem2;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.LocalDate;

public class InsurancePolicyManagement {
    Map<Integer, Policy> hashMapPolicies = new HashMap<>();
    Map<Integer, Policy> linkedHashMapPolicies = new LinkedHashMap<>();
    TreeMap<LocalDate, Policy> treeMapPolicies = new TreeMap<>();

    public void addPolicy(Policy policy) {
        hashMapPolicies.put(policy.getPolicyNumber(), policy);
        linkedHashMapPolicies.put(policy.getPolicyNumber(), policy);
        treeMapPolicies.put(policy.getExpiryDate(), policy);
    }

    public Policy getPolicyByNumber(int policyNumber) {
        return hashMapPolicies.get(policyNumber);
    }

    public void listExpiringPolicies() {
        System.out.println("Policies Expiring Within 30 Days:");
        LocalDate today = LocalDate.now();
        for (Map.Entry<LocalDate, Policy> entry : treeMapPolicies.entrySet()) {
            if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void listPoliciesByHolder(String holderName) {
        System.out.println("Policies for Policyholder: " + holderName);
        for (Policy policy : hashMapPolicies.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(holderName)) {
                System.out.println(policy);
            }
        }
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        treeMapPolicies.entrySet().removeIf(entry -> entry.getKey().isBefore(today));
        hashMapPolicies.entrySet().removeIf(entry -> entry.getValue().getExpiryDate().isBefore(today));
        linkedHashMapPolicies.entrySet().removeIf(entry -> entry.getValue().getExpiryDate().isBefore(today));
        System.out.println("Expired policies removed.");
    }

    public void displayAllPolicies() {
        System.out.println("All Policies:");
        for (Policy policy : linkedHashMapPolicies.values()) {
            System.out.println(policy);
        }
    }
}
