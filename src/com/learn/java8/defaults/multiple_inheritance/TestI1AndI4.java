package com.learn.java8.defaults.multiple_inheritance;

public class TestI1AndI4 implements Interface1, Interface4{
    public static void main(String[] args) {
        TestI1AndI4 testI1AndI4 = new TestI1AndI4();
        testI1AndI4.methodA();
    }

    @Override
    public void methodA() {
        //Interface4.super.methodA();
        System.out.println("methodA : " + TestI1AndI4.class);
    }
}
