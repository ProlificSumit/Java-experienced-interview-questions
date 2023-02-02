package com.learn.java8.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeTest {
    public static void parseTime() {
        String time = "13:15";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println("local time: " + localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("localTime1 : " + localTime1);

        String time2 = "13*13";
        LocalTime localTime2 = LocalTime.parse(time2, DateTimeFormatter.ofPattern("HH*mm"));
        System.out.println("localTime2 : " + localTime2);

        String time3 = "13|13|45";
        LocalTime localTime3 = LocalTime.parse(time3, DateTimeFormatter.ofPattern("HH|mm|ss"));
        System.out.println("localTime3 : " + localTime3);

    }

    public static void formatTime() {
        LocalTime localTime = LocalTime.now();
        String format = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("format : " + format);

        String format1 = localTime.format(DateTimeFormatter.ofPattern("HH|mm"));
        System.out.println("format1 : " + format1);

    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
