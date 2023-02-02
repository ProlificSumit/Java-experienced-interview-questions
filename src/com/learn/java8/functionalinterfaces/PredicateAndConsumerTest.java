package com.learn.java8.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerTest {
    Predicate<Student> p1 = student -> student.gradeLevel() >= 2;
    Predicate<Student> p2 = student -> student.gpa() >= 3.7;
    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 2 && gpa >= 3.7;
    BiConsumer<String, List<String>> nameAndActivitiesConsumer = (name, activities) -> System.out.println(name + " : " + activities);
    Consumer<Student> studentConsumer = student -> {
        if (biPredicate.test(student.gradeLevel(),student.gpa())) {
        //if (p1.and(p2).test(student)) {
            nameAndActivitiesConsumer.accept(student.name(), student.activities());
        }
    };

    public void filterStudents(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        PredicateAndConsumerTest test = new PredicateAndConsumerTest();
        test.filterStudents(allStudents);
    }
}
