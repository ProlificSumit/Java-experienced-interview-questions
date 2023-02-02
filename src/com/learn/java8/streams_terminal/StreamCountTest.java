package com.learn.java8.streams_terminal;

import com.learn.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamCountTest {

    public static Long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.gpa() >= 3.9)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
