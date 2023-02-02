package com.learn.java8.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    static UnaryOperator<String> unaryOperator = s -> s.concat(" world!").toUpperCase();
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("hello"));
    }
}
