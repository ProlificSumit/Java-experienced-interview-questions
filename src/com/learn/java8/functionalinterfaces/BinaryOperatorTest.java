package com.learn.java8.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> addBinaryOperator = (a, b) -> a + b;
        System.out.println(addBinaryOperator.apply(2, 3));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("MaxBy is : " + maxBy.apply(2, 3));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("minBy is : " + minBy.apply(2, 3));

    }
}
