package com.learn.java8.defaults.multiple_inheritance;

public interface Interface3 extends Interface2{
    default void methodC(){
        System.out.println("methodC : " + Interface3.class);
    }

    default void methodB(){
        System.out.println("methodB : " + Interface3.class);
    }
}
