package com.learn.fundamentals;

public class Demo3F {
    public static void main(String[] args) {
        final String s = "sumit";
        // fianl variables reassignment is not possible
        //s = s + "";

        Demo3F demo = new Demo3F();
        demo = null;
        System.gc();

    }

    @Override
    protected void finalize() throws Throwable {
        try {
            super.finalize();
            System.out.println("called finalize() via gc");
        } finally {
            System.out.println("In finally");
            super.finalize();
        }
    }
}
