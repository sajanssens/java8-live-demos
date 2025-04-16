package com.infosupport;

import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        Integer reduce = Stream.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
                .map(i -> 1)
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
