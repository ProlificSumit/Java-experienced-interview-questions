package com.learn.java8.streams;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsFlatMapTest {

    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::activities)
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                //.sorted(Comparator.reverseOrder())
                .toList();
    }


    public static Long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::activities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }
}
