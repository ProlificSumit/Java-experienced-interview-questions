package com.learn.java8.streams_terminal;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByTest {

    public static void groupingByTest() {
        Map<String, List<Student>> genderMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::gender));

        System.out.println(genderMap);
    }

    public static void customizedGroupingByTest() {
        Map<String, List<Student>> gpaMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.gpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(gpaMap);
    }

    public static void twoLevelGroupingByTest() {
        Map<Integer, Map<String, List<Student>>> groupByMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::gradeLevel, groupingBy(student -> student.gpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(groupByMap);
    }

    public static void twoLevelGroupingByTest_1() {
        Map<String, Integer> groupByMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::name, summingInt(Student::noteBooks)));
        System.out.println(groupByMap);
    }

    public static void threeArgumentGroupingByTest() {
        Map<String, Set<Student>> groupByMapWithSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::name, LinkedHashMap::new, toSet()));
        System.out.println(groupByMapWithSet);
    }

    public static void calculateHighestGpa(){
        Map<Integer, Optional<Student>> optionalMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::gradeLevel, maxBy(Comparator.comparing(Student::gpa))));
        System.out.println(optionalMap);

        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::gradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::gpa)), Optional::get)));

        System.out.println();
        System.out.println(studentMap);

    }

    public static void calculateLowestGpa(){
        Map<Integer, Optional<Student>> optionalMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::gradeLevel, minBy(Comparator.comparing(Student::gpa))));
        System.out.println(optionalMap);

        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::gradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::gpa)), Optional::get)));

        System.out.println();
        System.out.println(studentMap);

    }

    public static void main(String[] args) {
//        groupingByTest();
//        System.out.println();
//        customizedGroupingByTest();
//        System.out.println();
//        twoLevelGroupingByTest();
//        System.out.println();
//        twoLevelGroupingByTest_1();
//        System.out.println();
//        threeArgumentGroupingByTest();
        //calculateHighestGpa();
        calculateLowestGpa();
    }
}
