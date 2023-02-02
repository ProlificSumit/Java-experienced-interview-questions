package com.learn.java8.streams;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapTest {

    public static List<String> studentNamesList() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::name)
                .map(String::toUpperCase)
                .toList();
    }

    public static Set<String> studentNamesSet() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::name)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(studentNamesList());
        System.out.println(studentNamesSet());
    }
}
