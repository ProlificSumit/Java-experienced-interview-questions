package com.learn.java8.optional_test;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> student = Optional.ofNullable(null);
//        String name = student.map(Student::name)
//                .orElse(test());
//
//        System.out.println(student);
//        System.out.println(name);
//
//        String supplierName = student.map(Student::name)
//                .orElseGet(OptionalTest::test);
//        System.out.println(supplierName);

//        String orElseThrowName = student.map(Student::name)
//                .orElseThrow();
//        System.out.println(orElseThrowName);

        String orElseThrowNameSupplier = student.map(Student::name)
                .orElseThrow(OptionalTest::test2);
        System.out.println(orElseThrowNameSupplier);

    }

    private static <X extends Throwable> RuntimeException test2() {
        System.out.println("test2");
        return new RuntimeException("Student is empty");
    }

    static String test(){
        System.out.println("Testing");
        return "Default";
    }
}
