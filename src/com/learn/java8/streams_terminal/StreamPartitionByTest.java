package com.learn.java8.streams_terminal;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamPartitionByTest {

    public static void partitionByTest_1(){
        Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(student -> student.gpa() >= 3.8));

        System.out.println(studentMap);
    }

    public static void partitionByTest_2(){
        Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(student -> student.gpa() >= 3.8, toSet()));

        System.out.println(studentMap);
    }
    public static void main(String[] args) {
        partitionByTest_1();
    }
}
