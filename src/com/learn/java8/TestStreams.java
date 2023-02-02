package com.learn.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.random;

public class TestStreams {

    public static void main(String[] args) {
        Employee emp = new Employee(101, "john", 2000.0);
        Employee emp2 = new Employee(102, "doe", 98000.0);
        Employee emp3 = new Employee(103, "soe", 7000.0);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(emp2);
        employees.add(emp3);

        Double collect = employees.stream()
                .mapToDouble(Employee::salary)
                .sum();

        System.out.println(collect);

        List<Employee> sortedEmp = employees.stream()
                .sorted(Comparator.comparing(Employee::salary))
                .toList();

        System.out.println(sortedEmp);

        List<Integer> integerList = new ArrayList<>();
        fillList(integerList);
        System.out.println(integerList);

        List<Integer> newNumbers = integerList.stream()
                .map(x -> x * 2)
                .toList();
        System.out.println(newNumbers);
    }

    public static void fillList(List<Integer> numbers) {
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (random() * 20));
        }
    }
}
