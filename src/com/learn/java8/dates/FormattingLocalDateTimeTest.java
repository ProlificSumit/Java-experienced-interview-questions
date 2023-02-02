package com.learn.java8.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeTest {
    public static void parseLocalDateTime() {
        String dateTime = "2023-01-25T13:54:06.703239300";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime: " + localDateTime);

        // custom parsing
        String dateTime1 = "2023-01/25T13*54|06";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM/dd'T'HH*mm|ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println("localDateTime1: " + localDateTime1);

        String dateTime2 = "2023-01/25ABC13*54|06";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM/dd'ABC'HH*mm|ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime2, dateTimeFormatter1);
        System.out.println("localDateTime2: " + localDateTime2);

    }

    public static void formatLocalDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM/dd'T'HH*mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println("format: " + format);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM/dd'ABC'HH*mm|ss");
        String format1 = localDateTime.format(dateTimeFormatter1);
        System.out.println("format1 : " + format1);
    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
