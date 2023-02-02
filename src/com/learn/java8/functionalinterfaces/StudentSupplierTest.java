package com.learn.java8.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class StudentSupplierTest {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> StudentDataBase.getAllStudents().get(0);
        System.out.println("Student is : " + studentSupplier.get());
        Supplier<List<Student>> listSupplier = StudentDataBase::getAllStudents;
        System.out.println("Students are : " + listSupplier.get());

    }
}
