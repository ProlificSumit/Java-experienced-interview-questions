package com.learn.java8.defaults.multiple_inheritance;

public interface Interface2 extends Interface1{
    default void methodB() {
        System.out.println("methodB : " + Interface2.class);
    }

    default void methodA(){
        System.out.println("methodA : " + Interface3.class);
    }
}
