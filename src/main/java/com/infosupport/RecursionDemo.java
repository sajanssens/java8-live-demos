package com.infosupport;

public class RecursionDemo {

    // n = 10: 1 + 2 + 3 + .... + 10 Euler?
    public int imperative(int n) {
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            sum += i;
        }
        return sum;
    }

    public int recursive(int n) {
        if (n == 1) return 1;
        return n + recursive(n - 1);
    }

    // 5! = 5*4*3*2*1 = 5*4!
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
