package com.learn.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateTest {
    static Predicate<Integer> p1 = (i) -> i % 2 == 0;
    static Predicate<Integer> p2 = (i) -> i % 5 == 0;

    public static void main(String[] args) {
        System.out.println(p1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    static void predicateAnd() {
        System.out.println("Predicate and the result is : " + p1.and(p2).test(10));
        System.out.println("Predicate and the result is : " + p1.and(p2).test(9));
    }

    static void predicateOr() {
        System.out.println("Predicate OR the result is : " + p1.or(p2).test(10));
        System.out.println("Predicate OR the result is : " + p1.or(p2).test(8));
    }

    static void predicateNegate() {
        System.out.println("Predicate negate the result is : " + p1.or(p2).negate().test(10));
        System.out.println("Predicate negate the result is : " + p1.or(p2).negate().test(8));
    }
}
