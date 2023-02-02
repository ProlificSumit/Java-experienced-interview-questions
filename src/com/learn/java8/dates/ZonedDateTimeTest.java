package com.learn.java8.dates;

import java.time.*;

public class ZonedDateTimeTest {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : " + zonedDateTime);
        System.out.println("zonedOffset : " + zonedDateTime.getOffset());
        System.out.println("zone Id : " + zonedDateTime.getZone());
        System.out.println("Available zones : " + ZoneId.getAvailableZoneIds());
        ZoneId.getAvailableZoneIds()
                .stream()
                .forEach(System.out::println);

        System.out.println("Total zones : " + ZoneId.getAvailableZoneIds().size());

        System.out.println("Chicago CST : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit EST : " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("LA PST      : " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST  : " + ZonedDateTime.now(ZoneId.of("MST", ZoneId.SHORT_IDS)));
        System.out.println("Denver MST  : " + ZonedDateTime.now(ZoneId.of("America/Denver")));
        System.out.println("Denver MST  : " + ZonedDateTime.now(ZoneId.of("America/Denver")));
        System.out.println("Asia Dhaka  : " + ZonedDateTime.now(ZoneId.of("BST", ZoneId.SHORT_IDS)));
        System.out.println("Asia Dhaka Using Clock  : " + ZonedDateTime.now(Clock.system(ZoneId.of("BST", ZoneId.SHORT_IDS))));
        System.out.println();
        LocalDateTime bstTime = LocalDateTime.now(ZoneId.of("BST", ZoneId.SHORT_IDS));
        System.out.println("LocalDateTime in BST : " + bstTime);

        LocalDateTime istTimeUsingOfInstant = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("IST", ZoneId.SHORT_IDS));
        System.out.println("istTimeUsingOfInstant : " + istTimeUsingOfInstant);

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("zonedDateTime1 : " + zonedDateTime1);

        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Asia/Dhaka"));
        System.out.println("zonedDateTime2 : " + zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("offsetDateTime : " + offsetDateTime);
    }
}
