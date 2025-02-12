package com.example.day02collections.queueinterface;

import java.util.*;

public class HospitalTriageSystem {
    static class Patient {
        String name;
        int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }
    public static List<String> hospitalTriage(List<Patient> patients) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severity));
        pq.addAll(patients);
        List<String> treatmentOrder = new ArrayList<>();
        while (!pq.isEmpty()) {
            treatmentOrder.add(pq.poll().name);
        }
        return treatmentOrder;
    }

    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(new Patient("John", 3), new Patient("Alice", 5), new Patient("Bob", 2));
        System.out.println("Triage Order: " + hospitalTriage(patients));
    }
}
