package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        LocalDate localDate1 = LocalDate.of(1994, 01, 25);
        System.out.println("localDate1 = " + localDate1);
        LocalDate localDate2 = LocalDate.ofYearDay(1996, 145);
        System.out.println("localDate2 = " + localDate2);
        System.out.println("getDayOfMonth : " + localDate.getDayOfMonth());
        System.out.println("getChronology : " + localDate.getChronology());
        System.out.println("getDayOfYear : " + localDate.getDayOfYear());
        System.out.println("getMonthValue : " + localDate.getMonthValue());
        System.out.println("getMonth : " + localDate.getMonth());
        System.out.println("ChronoField.DAY_OF_WEEK : " + localDate.get(ChronoField.DAY_OF_WEEK));

        // Modifying LocalDate
        System.out.println("plusDays : " + localDate.plusDays(2));
        System.out.println("plusMonths : " + localDate.plusMonths(2));
        System.out.println("minusDays : " + localDate.minusDays(2));
        System.out.println("minusMonths : " + localDate.minusMonths(2));
        System.out.println("withYear : " + localDate.withYear(1994));
        System.out.println("withYear ChronoField : " + localDate.with(ChronoField.YEAR, 1996));
        System.out.println("withYear TemporalAdjusters.firstDayOfNextYear() : " + localDate.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.println("withYear TemporalAdjusters.lastDayOfMonth() : " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("localDate.minus(1, ChronoUnit.DECADES) : " + localDate.minus(1, ChronoUnit.DECADES));

        // Support methods
        System.out.println("isLeapYear : " + localDate.isLeapYear());
        System.out.println("isLeapYear : " + LocalDate.ofYearDay(2024, 1).isLeapYear());
        System.out.println("equal : " + localDate1.isEqual(localDate));

        //Unsupported methods

        //System.out.println("Subtracting unsupported units throws error : "+localDate1.minus(1, ChronoUnit.HOURS));

    }
}
