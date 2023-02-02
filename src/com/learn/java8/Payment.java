package com.learn.java8;

import java.util.UUID;

public interface Payment {

    void doTransaction();

    default void addCoupon() {
        System.out.println("Rs. 5 Cashback!");
    }

    static String generateTransactionId(String s) {
        String transactionId = s.concat(UUID.randomUUID().toString());
        System.out.println(transactionId);
        return transactionId;
    }
}
