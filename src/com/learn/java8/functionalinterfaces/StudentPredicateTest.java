package com.learn.java8.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class StudentPredicateTest {
    static Predicate<Student> p1 = student -> student.gradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.gpa() >= 3.6;

    public static void main(String[] args) {
        filterStudents();
    }

    static void filterStudents(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        System.out.println();
        //System.out.println(allStudents);
        System.out.println();
        allStudents.forEach(student -> {
            if (p1.and(p2).negate().test(student)){
                System.out.println(student);
            }
        });
    }
}
