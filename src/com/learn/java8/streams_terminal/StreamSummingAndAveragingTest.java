package com.learn.java8.streams_terminal;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamSummingAndAveragingTest {
    public static int summingIntTest() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::noteBooks));
    }

    public static double averagingIntTest() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::noteBooks));
    }

    public static void main(String[] args) {
        System.out.println("summingIntTest : " + summingIntTest());
        System.out.println("averagingIntTest : " + averagingIntTest());
    }
}
