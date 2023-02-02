package com.learn.java8.streams;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Predicate<Student> gradePredicate = student -> student.gradeLevel() >= 3;
        Predicate<Student> gpaPredicate = student -> student.gpa() >= 3.6;
        BinaryOperator<List<String>> binaryOperator = (oldEntry, newEntry) -> newEntry;
        // Create student map using stream
        // key is name and value is activities
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .peek(student -> {
                    System.out.println("stream starts : " + student);
                })
                .filter(gradePredicate)
                .peek(student -> {
                    System.out.println("After 1st Filter : " + student);
                })
                .filter(gpaPredicate)
                .peek(student -> {
                    System.out.println("After 2nd Filter : " + student);
                })
                // If keys are unique
                .collect(Collectors.toMap(Student::name, Student::activities));
        // If keys are not unique
        //.collect(Collectors.toMap(Student::name, Student::activities),binaryOperator);
        // If Keys are not unique and want to maintain insertion order
        //.collect(Collectors.toMap(Student::name, Student::activities, binaryOperator, LinkedHashMap::new));
        System.out.println(studentMap);

        // one stream can be iterated only once
        Stream<Student> studentStream = StudentDataBase.getAllStudents().stream();
        studentStream.forEach(student -> System.out.println(student));
        //studentStream.forEach(student -> System.out.println(student));
    }
}
