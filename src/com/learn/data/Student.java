package com.learn.data;

import java.util.List;

public record Student(String name, Integer gradeLevel, Double gpa, String gender, List<String> activities, Integer noteBooks) {

    public void printListOfActivities() {
        System.out.println(activities);
    }
}
