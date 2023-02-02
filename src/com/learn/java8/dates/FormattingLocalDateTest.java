package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTest {
    /**
     * It is used to convert String to Object i.e. LocalDate
     */
    public static void parseDate() {
        String date = "2018-01-25";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("LocalDate: " + localDate);

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("LocalDate1: " + localDate1);

        String date2 = "20180225";
        LocalDate localDate2 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2: " + localDate2);

        // custom defined date format
        String date3 = "25|01|1994";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd|MM|yyyy");
        LocalDate localDate3 = LocalDate.parse(date3, dateTimeFormatter);
        System.out.println("localDate3: " + localDate3);
    }

    /**
     * It is used to convert Object to String i.e. LocalDate to String
     */
    public static void formatDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd|MM|yyyy");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate: " + formattedDate);

        String formattedDate1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("formattedDate1: " + formattedDate1);

        String formattedDate2 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("formattedDate2: " + formattedDate2);
    }


    public static void main(String[] args) {
        parseDate();
        formatDate();

    }
}
