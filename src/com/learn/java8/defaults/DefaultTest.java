package com.learn.java8.defaults;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultTest {
    static Consumer<Student> studentConsumer = student -> System.out.println(student);

    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Adam", "John", "Doe", "Eric", "Lily", "Alex");
//        Collections.sort(names);
//        System.out.println(names);
//
//        // Post Java 8
//        names.sort(Comparator.naturalOrder());
//        System.out.println(names);

        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(studentConsumer);

        System.out.println();
        Comparator<Student> nameComparator = Comparator.comparing(Student::name);
        Comparator<Student> gpaComparator = Comparator.comparing(Student::gpa);
        Comparator<Student> gradeLevelComparator = Comparator.comparing(Student::gradeLevel);
        //allStudents.sort(nameComparator);
        allStudents.forEach(studentConsumer);
        allStudents.sort(Comparator.nullsLast(nameComparator)
                //.thenComparing(nameComparator)
                .thenComparing(gpaComparator));
                //.thenComparing(gradeLevelComparator)
        System.out.println();
        allStudents.forEach(studentConsumer);
    }
}
