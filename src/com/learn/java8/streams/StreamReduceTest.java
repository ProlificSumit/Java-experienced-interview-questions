package com.learn.java8.streams;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceTest {

    static Integer performMultiplication(List<Integer> integers) {
        return integers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {
        return integers.stream()
                .reduce((a, b) -> a * b);
    }

    static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.gpa() > s2.gpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);

        System.out.println(performMultiplication(integers));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        result.ifPresent(System.out::println);

        integers = new ArrayList<>();
        result = performMultiplicationWithoutIdentity(integers);
        result.ifPresent(System.out::println);

        Optional<Student> highestGpaStudent = getHighestGpaStudent();
        highestGpaStudent.ifPresent(System.out::println);
    }
}
