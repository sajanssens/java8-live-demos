package com.infosupport;

import java.util.function.Function;
import java.util.function.Supplier;

public class QuizLambdas {

    public static void main(String[] args) {
        Supplier<String> s = () -> "Raoul";
        Function<Integer, String> f = (Integer i) -> "Koen " + i;
        System.out.println(f.apply(42));
        System.out.println(f.apply(43));
    }

    public String x(String s) {
        return "Iron Man";
    }
}
