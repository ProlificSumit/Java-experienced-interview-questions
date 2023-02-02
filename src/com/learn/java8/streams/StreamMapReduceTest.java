package com.learn.java8.streams;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

public class StreamMapReduceTest {

    static Integer getTotalNoOfNoteBooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::noteBooks)
                .reduce(0, Integer::sum);
        //.reduce(0, (a, b) -> a + b);
    }

    public static void main(String[] args) {
        System.out.println(getTotalNoOfNoteBooks());
    }
}
