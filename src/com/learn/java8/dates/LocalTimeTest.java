package com.learn.java8.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalTime localTime1 = LocalTime.of(22, 22);
        System.out.println("localTime1 = " + localTime1);
        LocalTime localTime2 = LocalTime.of(22, 24, 26);
        System.out.println("localTime2 = " + localTime2);
        System.out.println("getHour : " + localTime.getHour());
        System.out.println("toSecondOfDay : " + localTime.toSecondOfDay());
        System.out.println("HOUR_OF_DAY : " + localTime1.get(ChronoField.HOUR_OF_DAY));

        // Modifying values
        System.out.println("minus ChronoUnit.HOURS : "+localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("midnight : "+localTime.with(LocalTime.MIDNIGHT));
    }
}
