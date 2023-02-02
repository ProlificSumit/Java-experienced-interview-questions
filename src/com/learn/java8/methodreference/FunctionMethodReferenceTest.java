package com.learn.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceTest {
    static Function<String,String> function = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(function.apply("hello"));
    }
}
