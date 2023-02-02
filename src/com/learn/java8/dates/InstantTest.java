package com.learn.java8.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("instant : " + instant);

        // Jan 1st 1970 -> Epoch -> 86400
        System.out.println("getEpochSecond : "+instant.getEpochSecond());

        Instant instant1 = Instant.now();
        Duration between = Duration.between(instant1, instant);
        System.out.println("Difference : "+between.getNano());
    }
}
