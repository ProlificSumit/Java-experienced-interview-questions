package com.learn.java8.numericstream;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamBoxingAndUnBoxing {
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 50)
                // int
                .boxed()
                // Integer
                .toList();
    }

    public static int unBoxing(List<Integer> integerList) {
        return integerList.stream()
                // Integer
                .mapToInt(Integer::intValue)
                // int
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing : " + boxing());
        System.out.println("Unboxing : " + unBoxing(boxing()));
    }
}
