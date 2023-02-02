package com.learn.java8.numericstream;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamMapTest {
    public static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1, 5)
                .mapToObj(Integer::valueOf)
                .toList();
    }

    public static Long mapToLong() {
        return IntStream.rangeClosed(1, 5)
                .mapToLong(Long::valueOf)
                .sum();
    }

    public static Double mapToDouble() {
        return IntStream.rangeClosed(1, 5)
                .mapToDouble(Double::valueOf)
                .sum();
    }


    public static void main(String[] args) {
        mapToObj().forEach(System.out::println);
        System.out.println("mapToLong : " + mapToLong());
        System.out.println("mapToDouble : " + mapToDouble());
    }
}
