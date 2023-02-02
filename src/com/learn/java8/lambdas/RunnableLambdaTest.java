package com.learn.java8.lambdas;

public class RunnableLambdaTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        };
        new Thread(runnable).start();

        // Java 8 lambda

        // () -> {}
        Runnable lambda = () -> System.out.println("Inside lambda Runnable 1");

        new Thread(lambda).start();
        new Thread(() -> System.out.println("Inside lambda Runnable 2")).start();

    }
}
