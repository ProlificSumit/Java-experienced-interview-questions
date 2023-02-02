package com.learn.java8;

public class Paytm implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("Payment from PayTm");
    }
}
