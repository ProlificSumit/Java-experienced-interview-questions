package com.learn.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaTest {
    public static void main(String[] args) {
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(integerComparator.compare(3,4));

        Comparator<Integer> integerLambdaComparator = (o1,o2) -> o1.compareTo(o2);
        System.out.println(integerLambdaComparator.compare(3,4));
    }
}
