package com.example.day02collections.mapinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GroupObjectsTest {

    @Test
    void testGroupByDepartmentWithMultipleDepartments() {
        List<GroupObjects.Employee> employees = Arrays.asList(
                new GroupObjects.Employee("Ankit", "HR"),
                new GroupObjects.Employee("Anand", "IT"),
                new GroupObjects.Employee("Aakrati", "HR")
        );

        Map<String, List<GroupObjects.Employee>> expected = new HashMap<>();
        expected.put("HR", Arrays.asList(new GroupObjects.Employee("Ankit", "HR"), new GroupObjects.Employee("Aakrati", "HR")));
        expected.put("IT", Collections.singletonList(new GroupObjects.Employee("Anand", "IT")));

        Map<String, List<GroupObjects.Employee>> result = GroupObjects.groupByDepartment(employees);

        assertEquals(expected.keySet(), result.keySet());
        assertEquals(expected.get("HR").size(), result.get("HR").size());
        assertEquals(expected.get("IT").size(), result.get("IT").size());
    }

    @Test
    void testGroupByDepartmentWithSingleDepartment() {
        List<GroupObjects.Employee> employees = Arrays.asList(
                new GroupObjects.Employee("John", "Finance"),
                new GroupObjects.Employee("Alice", "Finance")
        );

        Map<String, List<GroupObjects.Employee>> expected = new HashMap<>();
        expected.put("Finance", Arrays.asList(new GroupObjects.Employee("John", "Finance"), new GroupObjects.Employee("Alice", "Finance")));

        Map<String, List<GroupObjects.Employee>> result = GroupObjects.groupByDepartment(employees);

        assertEquals(expected.keySet(), result.keySet());
        assertEquals(expected.get("Finance").size(), result.get("Finance").size());
    }

    @Test
    void testGroupByDepartmentWithEmptyList() {
        List<GroupObjects.Employee> employees = new ArrayList<>();
        Map<String, List<GroupObjects.Employee>> expected = new HashMap<>();

        assertEquals(expected, GroupObjects.groupByDepartment(employees));
    }

    @Test
    void testGroupByDepartmentWithDifferentCaseDepartments() {
        List<GroupObjects.Employee> employees = Arrays.asList(
                new GroupObjects.Employee("Mike", "Sales"),
                new GroupObjects.Employee("Steve", "sales")
        );

        Map<String, List<GroupObjects.Employee>> result = GroupObjects.groupByDepartment(employees);

        assertEquals(2, result.size());
        assertTrue(result.containsKey("Sales"));
        assertTrue(result.containsKey("sales"));
    }

    @Test
    void testGroupByDepartmentWithOneEmployee() {
        List<GroupObjects.Employee> employees = Collections.singletonList(new GroupObjects.Employee("Eve", "Marketing"));

        Map<String, List<GroupObjects.Employee>> result = GroupObjects.groupByDepartment(employees);

        assertEquals(1, result.size());
        assertTrue(result.containsKey("Marketing"));
        assertEquals(1, result.get("Marketing").size());
        assertEquals("Eve", result.get("Marketing").get(0).name);
    }
}
