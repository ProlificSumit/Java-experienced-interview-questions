package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(1994, 01, 25, 5, 55, 44, 5569);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime2);

        // getting the time and date from LocalDateTime instance

        System.out.println("Hour : " + localDateTime.getHour());
        System.out.println("getMinute : " + localDateTime.getMinute());
        System.out.println("getDayOfMonth : " + localDateTime.getDayOfMonth());
        System.out.println("DAY_OF_MONTH : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        // with methods
        LocalDateTime localDateTime3 = localDateTime.plus(2, ChronoUnit.HOURS);
        LocalDateTime localDateTime4 = localDateTime.minus(2, ChronoUnit.HOURS);
        LocalDateTime localDateTime5 = localDateTime.minus(2, ChronoUnit.DAYS);
        System.out.println("localDateTime.plus(2, ChronoUnit.HOURS) : " + localDateTime3);
        System.out.println("localDateTime.minus(2, ChronoUnit.HOURS) : " + localDateTime4);
        System.out.println("localDateTime.minus(2, ChronoUnit.DAYS) : " + localDateTime5);

        // Converting LocalDate and LocalTime to LocalDateTime and vice versa
        LocalDate localDate = LocalDate.of(2019, 01, 5);
        LocalDateTime localDateTime6 = localDate.atTime(12, 32);
        System.out.println("localDateTime6 : " + localDateTime6);

        LocalTime localTime = LocalTime.of(23, 34);
        LocalDateTime localDateTime7 = localTime.atDate(localDate);
        System.out.println("localDateTime7 : " + localDateTime7);

        System.out.println("LocalTimeDate to LocalDate : "+localDateTime7.toLocalDate());
        System.out.println("LocalTimeDate to LocalTime : "+localDateTime7.toLocalTime());
    }
}
