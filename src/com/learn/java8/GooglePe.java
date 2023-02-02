package com.learn.java8;

public class GooglePe implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("Payment from GooglePe");
    }

    @Override
    public void addCoupon() {
        System.out.println("10% Cashback from GooglePe");
    }
}
