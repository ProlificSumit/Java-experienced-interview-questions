package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018, 1, 1);
        LocalDate localDate1 = LocalDate.of(2018, 12, 31);

        Period difference = Period.between(localDate, localDate1);
        System.out.println("difference: " + difference);
        System.out.println("Period : " + difference + " years : " + difference.getYears());

        Period period = localDate.until(localDate1);
        System.out.println("getDays : " + period.getDays()); // result is 30 -> performs 31 - 1 = 30
        System.out.println("getMonths : " + period.getMonths()); // result is 11 -> performs 12 - 1 = 11
        System.out.println("getYears : " + period.getYears());
        Period period1 = Period.ofDays(10);
        System.out.println("period1: " + period1);
        Period period2 = Period.ofYears(10);
        System.out.println("period2: " + period2);
        System.out.println("toTotalMonths: " + period2.toTotalMonths());

    }
}
