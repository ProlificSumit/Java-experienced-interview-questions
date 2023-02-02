package com.learn.java8.parallel_stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamTest {
    public static long checkPerformance(Integer numberOfTimes, Supplier<Integer> supplier) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 1000)
                .sum();
    }

    public static int parallelSumSequentialStream() {
        return IntStream.rangeClosed(1, 1000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential stream result : " + checkPerformance(10, ParallelStreamTest::sumSequentialStream));
        System.out.println("Parallel stream result : " + checkPerformance(10, ParallelStreamTest::sumSequentialStream));
    }
}
