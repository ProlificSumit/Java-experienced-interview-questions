package com.learn.java8.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(3);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(4, 54);
        LocalTime localTime1 = LocalTime.of(10, 2);

        Duration duration1 = Duration.between(localTime1, localTime);
        System.out.println("duration1 = " + duration1);

        long diffInMin = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("diffInMin = " + diffInMin);
    }
}
