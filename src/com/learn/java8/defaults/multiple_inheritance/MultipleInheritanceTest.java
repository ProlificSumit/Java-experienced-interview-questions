package com.learn.java8.defaults.multiple_inheritance;

public class MultipleInheritanceTest implements Interface1, Interface2, Interface3 {
    public void methodA(){
        System.out.println("methodA : "+ MultipleInheritanceTest.class);
    }
    public static void main(String[] args) {
        MultipleInheritanceTest test = new MultipleInheritanceTest();
        test.methodA();
        test.methodB();
        test.methodC();
    }
}
