package com.learn.java8.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentTest {
    static Function<List<Student>, Map<String, Double>> function = students -> {
        HashMap<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (StudentPredicateTest.p1.test(student)) {
                studentGradeMap.put(student.name(), student.gpa());
            }
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(function.apply(StudentDataBase.getAllStudents()));
    }
}
