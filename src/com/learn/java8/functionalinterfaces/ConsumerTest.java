package com.learn.java8.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    static List<Student> allStudents = StudentDataBase.getAllStudents();
    static Consumer<Student> nameConsumer = (student) -> System.out.print(student.name());
    static Consumer<Student> activitiesConsumer = (student) -> System.out.println(student.activities());
    static Consumer<Student> studentConsumer = (student) -> System.out.println(student);


    public static void main(String[] args) {
        Consumer<String> consumer = consumer = (e) -> System.out.println(e.toUpperCase());
        consumer.accept("test");
        //printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

    static void printStudents() {
        System.out.println("printing students : ");
        allStudents.forEach(studentConsumer);
    }

    static void printNameAndActivities() {
        System.out.println("printNameAndActivities : ");

        allStudents.forEach(nameConsumer.andThen(activitiesConsumer));
    }

    static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition : ");
        allStudents.forEach(s -> {
            if (s.gradeLevel() > 3 && s.gpa() >= 3.9) {
                nameConsumer.andThen(activitiesConsumer)
                        .accept(s);
            }
        });
    }
}
