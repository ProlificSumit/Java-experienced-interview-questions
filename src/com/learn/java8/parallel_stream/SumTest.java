package com.learn.java8.parallel_stream;

import java.util.stream.IntStream;

public class SumTest {
    public static void main(String[] args) {
        Sum sum = new Sum();

        IntStream.rangeClosed(0, 1000)
                .forEach(sum::performSum);
        System.out.println(sum.getTotal());

        IntStream.rangeClosed(0, 1000)
                .parallel()
                .forEach(sum::performSum);
        System.out.println(Thread.currentThread().getName());
        System.out.println(sum.getTotal());
    }
}
