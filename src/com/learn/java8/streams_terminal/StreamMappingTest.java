package com.learn.java8.streams_terminal;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamMappingTest {
    public static void main(String[] args) {
        List<String> nameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::name, toList()));
        System.out.println("nameList: " + nameList);

        Set<String> nameSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::name, toSet()));

        System.out.println("nameSet: " + nameSet);

    }
}
