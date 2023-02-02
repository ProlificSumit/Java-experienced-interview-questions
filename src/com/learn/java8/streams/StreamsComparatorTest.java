package com.learn.java8.streams;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorTest {

    public static List<Student> sortByNames(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::name))
                .toList();
    }

    public static List<Student> sortByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::gpa).reversed())
                .toList();
    }

    public static void main(String[] args) {
        System.out.println("Sorted By Names");
        System.out.println(sortByNames());
        System.out.println("Sorted By GPA");
        System.out.println(sortByGpa());
    }
}
