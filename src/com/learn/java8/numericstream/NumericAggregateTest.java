package com.learn.java8.numericstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericAggregateTest {
    public static void main(String[] args) {
        System.out.println("Sum is : " + IntStream.rangeClosed(1, 50).sum());
        OptionalInt optionalIntMax = IntStream.rangeClosed(1, 50).max();
        optionalIntMax.ifPresent(System.out::println);
        OptionalLong optionalLongMin = LongStream.rangeClosed(1, 50).min();
        optionalLongMin.ifPresent(System.out::println);
        OptionalDouble optionalDouble = IntStream.rangeClosed(50, 100).average();
        optionalDouble.ifPresent(System.out::println);
    }
}
