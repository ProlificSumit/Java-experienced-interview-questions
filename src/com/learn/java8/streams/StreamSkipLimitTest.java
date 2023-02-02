package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSkipLimitTest {

    static Optional<Integer> limitSum(List<Integer> integers) {
        return integers.stream()
                .limit(3)
                .reduce((a, b) -> a + b);
    }

    static Optional<Integer> skipSum(List<Integer> integers) {
        return integers.stream()
                .skip(4)
                .reduce((a, b) -> a + b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        Optional<Integer> limitSum = limitSum(integers);
        limitSum.ifPresent(System.out::println);
        Optional<Integer> skipSum = skipSum(integers);
        skipSum.ifPresent(System.out::println);
    }
}
