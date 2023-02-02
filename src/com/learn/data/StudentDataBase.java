package com.learn.data;

import java.util.List;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> new Student("John", 2, 3.6, "Male", asList("swimming", "basketball", "volleyball"), 12);

    public static List<Student> getAllStudents() {
        Student student1 = new Student("Wednesday", 2, 3.6, "Male", asList("swimming", "basketball", "volleyball"), 12);
        Student student2 = new Student("John", 2, 3.8, "Female", asList("swimming", "chess", "ludo"), 45);

        Student student4 = new Student("Lily", 3, 4.0, "Female", asList("walking", "surfing", "swimming"), 8);
        Student student3 = new Student("Dom", 3, 3.7, "Male", asList("cricket", "football", "hockey"), 14);

        Student student5 = new Student("Sophia", 4, 3.5, "Male", asList("dancing", "basketball", "volleyball"), 5);
        Student student6 = new Student("Alex", 4, 3.9, "Female", asList("swimming", "running", "volleyball"), 1);
        //Student student7 = new Student("Sophia", 4, 3.9, "Female", asList("shopping", "sleeping", "eating"), 2);
        return asList(student1, student2, student3, student4, student5, student6);
    }
}
