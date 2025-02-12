package com.example.day02collections.mapinterface;

import java.util.*;

public class GroupObjects {
    static class Employee {
        String name;
        String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee e : employees) {
            departmentMap.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
        }
        return departmentMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ankit", "HR"),
                new Employee("Anand", "IT"),
                new Employee("Aakrati", "HR"));
        System.out.println("Grouped Employees: " + groupByDepartment(employees));
    }
}
