package com.learn.java8.defaults.multiple_inheritance;

public interface Interface1 {
    default void methodA() {
        System.out.println("methodA : " + Interface1.class);
    }
}
