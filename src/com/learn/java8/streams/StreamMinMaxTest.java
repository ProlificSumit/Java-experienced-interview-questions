package com.learn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxTest {
    static Integer getMaxValue(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
    }

    static Optional<Integer> getMaxValueWithOptional(List<Integer> integers) {
        return integers.stream()
                .reduce((a, b) -> a > b ? a : b);
    }

    static Optional<Integer> getMinValueWithOptional(List<Integer> integers) {
        return integers.stream()
                .reduce((a, b) -> a < b ? a : b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println(getMaxValue(integers));
        Optional<Integer> maxValueWithOptional = getMaxValueWithOptional(integers);
        maxValueWithOptional.ifPresent(System.out::println);
        Optional<Integer> minValueWithOptional = getMinValueWithOptional(integers);
        minValueWithOptional.ifPresent(System.out::println);

        integers = new ArrayList<>();
        System.out.println(getMaxValue(integers));
        maxValueWithOptional = getMaxValueWithOptional(integers);
        System.out.println(maxValueWithOptional.isPresent() ? "Optional maxValue is : " + maxValueWithOptional.get() : "List is empty : " + maxValueWithOptional);
        minValueWithOptional = getMinValueWithOptional(integers);
        System.out.println(minValueWithOptional.isPresent() ? "Optional minValue is : " + minValueWithOptional.get(): "List is empty : " + minValueWithOptional);

    }
}
