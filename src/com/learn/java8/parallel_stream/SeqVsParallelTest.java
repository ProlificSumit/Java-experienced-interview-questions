package com.learn.java8.parallel_stream;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class SeqVsParallelTest {

    public static void sequentialStreamTest() {
        long start = System.currentTimeMillis();
        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::activities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("sequentialStreamTest : " + (end - start));
    }

    public static void parallelStreamTest() {
        long start = System.currentTimeMillis();
        StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::activities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("parallelStreamTest : " + (end - start));
    }

    public static void main(String[] args) {
        sequentialStreamTest();
        parallelStreamTest();

    }
}
