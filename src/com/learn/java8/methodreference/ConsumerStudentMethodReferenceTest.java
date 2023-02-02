package com.learn.java8.methodreference;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerStudentMethodReferenceTest {
    static Consumer<Student> studentConsumer = System.out::println;
    static Consumer<Student> activitiesList = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
        System.out.println();
        StudentDataBase.getAllStudents().forEach(activitiesList);
    }
}
