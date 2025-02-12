package com.example.day02collections.insurancepolicymanagementsystem2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManagement manager = new InsurancePolicyManagement();

        Policy p1 = new Policy(101, "Ankit", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(102, "Aakrati", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy(103, "Anand", LocalDate.now().plusDays(20), "Home", 7000);
        Policy p4 = new Policy(104, "Avinash", LocalDate.now().minusDays(5), "Health", 4500);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        manager.displayAllPolicies();
        manager.listExpiringPolicies();
        manager.listPoliciesByHolder("Alice");
        manager.removeExpiredPolicies();
        manager.displayAllPolicies();
    }
}
