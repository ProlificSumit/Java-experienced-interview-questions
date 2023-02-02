package com.learn.java8.streams_terminal;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinByMaxByTest {
    public static Optional<Student> minByTest() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::gpa)));
    }

    public static Optional<Student> maxByTest() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::gpa)));
    }

    public static void main(String[] args) {
        System.out.println(minByTest().isPresent() ? minByTest().get() : "No input");
        System.out.println(maxByTest().isPresent() ? maxByTest().get() : "No input");
    }
}
