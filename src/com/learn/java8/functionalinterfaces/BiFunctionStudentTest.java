package com.learn.java8.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiFunctionStudentTest {
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = (students, studentPredicate) -> {
      Map<String,Double> gpaMap = new HashMap<>();
      students.forEach( student -> {
          if (studentPredicate.test(student)) {
              gpaMap.put(student.name(),student.gpa());
          }
      });
      return gpaMap;
    };

    static BiFunction<List<Student>, BiPredicate<Integer,Double>, Map<String,Double>> biFunction2 = (students, studentPredicate) -> {
        Map<String,Double> gpaMap = new HashMap<>();
        students.forEach( student -> {
            if (studentPredicate.test(student.gradeLevel(), student.gpa())) {
                gpaMap.put(student.name(),student.gpa());
            }
        });
        return gpaMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),StudentPredicateTest.p1));
        BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 3 && gpa >= 3.7;
        System.out.println(biFunction2.apply(StudentDataBase.getAllStudents(),biPredicate));
    }
}
