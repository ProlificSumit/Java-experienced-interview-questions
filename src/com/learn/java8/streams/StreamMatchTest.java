package com.learn.java8.streams;

import com.learn.data.StudentDataBase;

public class StreamMatchTest {
    static Boolean allMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.gpa() >= 3.4);
    }

    static Boolean anyMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.gpa() > 3.4);
    }

    static Boolean noneMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.gpa() <= 3.4);
    }

    public static void main(String[] args) {
        System.out.println("allMatch test : " + allMatch());
        System.out.println("anyMatch test : " + anyMatch());
        System.out.println("noneMatch test : " + noneMatch());
    }
}
