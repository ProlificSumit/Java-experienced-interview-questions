package com.learn.java8.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println("s : " + s + ", s2 : " + s2);
            }
        };

        biConsumer.accept("Java11", "Java17");

        biConsumer = (s1, s2) -> System.out.println("s1 : " + s1 + ", s2 : " + s2);
        biConsumer.accept("Java11", "Java17");

        Integer count = 1;
        BiConsumer<Integer, Integer> multiply = (i1, i2) -> System.out.println("Multiplication is : " + (i1 * i2));
        multiply.accept(4, 5);

        BiConsumer<Integer, Integer> division = (i1, i2) -> System.out.println("Division is : " + (i1 / i2));
        multiply.andThen(division)
                .accept(10, 5);
        nameAndActivities();
    }

    public static void nameAndActivities() {
        List<Student> students = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> nameAndActivities = (name, activities) -> System.out.println("name : " + name + " , Activities : " + activities);
        students.forEach(student -> nameAndActivities.accept(student.name(), student.activities()));
    }
}
