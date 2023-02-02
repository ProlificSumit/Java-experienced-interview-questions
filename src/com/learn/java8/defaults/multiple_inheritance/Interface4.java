package com.learn.java8.defaults.multiple_inheritance;

public interface Interface4 {
    default void methodA() {
        System.out.println("methodA : " + Interface4.class);
    }
}
