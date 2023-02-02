package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeTest {
    public static void main(String[] args) {
        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);

        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : " + localTime);

        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : " + localDateTime);
    }
}
