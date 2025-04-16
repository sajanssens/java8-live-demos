package com.infosupport;

import java.util.stream.Stream;

public class OptionalDemo {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 3);

        Integer i = integerStream
                .filter(s -> s % 2 == 0)
                .findAny()
                .map(v -> v * 2)
                .filter(v -> v < 100)
                .orElse(0);
    }
}
