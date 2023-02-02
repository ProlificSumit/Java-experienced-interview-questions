package com.learn.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionalInterfaceTest {
    static Function<String, String> function = s -> s.toUpperCase();
    static Function<String, String> appendFunction = s -> s.toUpperCase().concat(" world!");
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(function.apply(s));
        System.out.println(function.andThen(appendFunction).apply(s));
        System.out.println(function.compose(appendFunction).apply(s));
    }
}
