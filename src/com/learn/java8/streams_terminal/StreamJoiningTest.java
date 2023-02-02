package com.learn.java8.streams_terminal;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import static java.util.stream.Collectors.joining;

public class StreamJoiningTest {

    public static String joining_1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::name)
                .collect(joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::name)
                .collect(joining("-"));
    }

    public static String joining_3() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::name)
                .collect(joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining_1 : " + joining_1());
        System.out.println("Joining_2 : " + joining_2());
        System.out.println("Joining_3 : " + joining_3());
    }
}
