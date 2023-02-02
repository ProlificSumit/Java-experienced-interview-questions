package com.learn.java8.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamTest {

    static int sumOfNNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a + b);
    }

    static int sumOfNNumbersUsingIntStream(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .sum();

    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sumOfNNumbers Sum of N numbers is : " + sumOfNNumbers(numbers));
        System.out.println("sumOfNNumbersUsingIntStream Sum of N numbers is : " + sumOfNNumbersUsingIntStream(0, 10));
    }
}
