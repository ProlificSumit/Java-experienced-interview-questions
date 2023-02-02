package com.learn;

import com.learn.inheritance.Child;
import com.learn.inheritance.Parent;
import com.learn.java8.GooglePe;
import com.learn.java8.Payment;
import com.learn.java8.Paytm;
import com.learn.java8.PhonePe;

public class Main {
    public static void main(String[] args) {

//        Parent parent = new Child();
//        parent.m1();
//        parent.m2();
//
//        Child child = new Child();
//        child.m1();
//        //child = new Parent();
//        child.m2();

        // Java 8 default and static methods

        Payment phonePe = new PhonePe();
        phonePe.doTransaction();
        phonePe.addCoupon();
        Payment.generateTransactionId("PhonePe1");

        Payment googlePe = new GooglePe();
        googlePe.doTransaction();
        googlePe.addCoupon();
        Payment.generateTransactionId("GPay1");

        Payment payTm = new Paytm();
        payTm.doTransaction();
        payTm.addCoupon();
        Payment.generateTransactionId("Paytm1");

        Payment payment = () -> System.out.println("Lambda Implementation");
        System.out.println("\nB4");
        payment.addCoupon();
        payment.doTransaction();
        Payment.generateTransactionId("Anonymous1");
    }
}