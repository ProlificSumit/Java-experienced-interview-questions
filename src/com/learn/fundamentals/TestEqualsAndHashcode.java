package com.learn.fundamentals;

import java.util.HashSet;
import java.util.Set;

public class TestEqualsAndHashcode {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Sumit");
        Employee employee1 = new Employee(101, "Sumit");

        System.out.println(employee.hashCode());
        System.out.println(employee.hashCode() == employee1.hashCode());
        System.out.println(employee.equals(employee1));

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee);
        employeeSet.add(employee1);
        System.out.println(employeeSet);
    }
}
