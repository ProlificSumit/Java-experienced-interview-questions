package com.learn.java8.streams;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.Optional;

public class StreamFindFirstFindAnyTest {

    static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.gpa() >=3.9)
                .findAny();
    }

    static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.gpa() >=3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> anyStudent = findAnyStudent();
        anyStudent.ifPresent(System.out::println);
        Optional<Student> firstStudent = findFirstStudent();
        firstStudent.ifPresent(System.out::println);
    }
}
