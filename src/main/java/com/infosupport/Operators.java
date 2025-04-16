package com.infosupport;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Operators {

    public static void main(String[] args) {
        //      operand  operator   operand
        int a = 1 + 2; // binary operator
        int b = -a; // unary operator
        int c = a > 0 ? 42 : 43; // ternary operator

        UnaryOperator<Integer> negate = i -> -i;
        BinaryOperator<Integer> sum = (i, j) -> i + j;
        BiFunction<Integer, String, String> concat = (i, j) -> i + j + "!";

        Function<Integer, String> f = i -> i + "!";

        Stream.of(a, b, c)
                .map(negate)
                .forEach(System.out::println);
    }
}
