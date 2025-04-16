package com.infosupport;

import java.util.stream.Gatherer;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class GathererDemo {

    public static void main(String[] args) {
        Stream.generate(() -> (int) (Math.random() * 100))
                .limit(10)
                .gather(gt(50))
                .gather(Gatherers.windowFixed(2))
                .forEach(System.out::println);
    }

    public static Gatherer<Number, ?, Number> gt(int threshold) {
        return Gatherer.ofSequential((_, element, downstream) -> {
            if (element.intValue() > threshold) downstream.push(element);
            return true;
        });
    }
}
