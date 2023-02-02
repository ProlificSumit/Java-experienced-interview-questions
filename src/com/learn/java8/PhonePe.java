package com.learn.java8;

public class PhonePe implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("Payment from PhonePe!");
    }
}
