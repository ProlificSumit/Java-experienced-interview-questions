package com.learn.java8.numericstream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesTest {
    public static void main(String[] args) {
        System.out.println("IntStream tests starts");
        System.out.println("IntStream range count : " + IntStream.range(1, 50).count());
        IntStream.range(1, 50).forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("IntStream rangeClosed count : " + IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("IntStream tests ends");

        System.out.println("LongStream tests starts");
        System.out.println("LongStream range count : " + LongStream.range(1, 50).count());
        LongStream.range(1, 50).forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("LongStream rangeClosed count : " + LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("LongStream tests ends");
        System.out.println("DoubleStream tests starts");
        IntStream.rangeClosed(1, 50)
                .asDoubleStream()
                .forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("DoubleStream tests ends");


    }
}
