package com.learn.java8.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeTest {
    public static void main(String[] args) {

        /**
         * Imperative Style
         */
        Long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Imperative sum = " + sum + " time taken = " + (System.currentTimeMillis() - start));

        /**
         * Declarative Style
         */

        start = System.currentTimeMillis();

        int sum1 = IntStream.rangeClosed(0, 100)
                //.parallel()
                .sum();

        System.out.println("Declarative sum = " + sum1 + " time taken = " + (System.currentTimeMillis() - start));

        // Imperative Style

        start = System.currentTimeMillis();
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 1);
        List<Integer> uniqueIntegers = new ArrayList<>();

        for (Integer integer : integers) {
            if (!uniqueIntegers.contains(integer)) {
                uniqueIntegers.add(integer);
            }
        }
        System.out.println();
        System.out.println("Imperative uniqueInteger = " + uniqueIntegers + " time taken = " + (System.currentTimeMillis() - start));

        // Declarative Style

        start = System.currentTimeMillis();
        List<Integer> uniqueIntegers1 = integers.stream()
                .distinct()
                .toList();

        System.out.println("Declarative uniqueInteger = " + uniqueIntegers1 + " time taken = " + (System.currentTimeMillis() - start));

    }

}
