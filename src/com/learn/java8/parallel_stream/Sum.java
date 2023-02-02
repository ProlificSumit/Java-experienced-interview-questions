package com.learn.java8.parallel_stream;

public class Sum {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int num) {
        total += num;
    }
}
