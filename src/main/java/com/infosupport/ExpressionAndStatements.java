package com.infosupport;

import java.util.function.Function;

public class ExpressionAndStatements {
    public static void main(String[] args) {

        // expression = value, moet meestal nog geëvalueerd (uitgerekend) worden
        // bijv.: 1, 1+1
        // je moet ze toekennen aan een variabele of direct inline gebruiken
        int i = 1 + 1;
        System.out.println(42);

        // statement is een opdracht: doet iets.
        // soorten:
        // - assignment statement
        int j = 1 + 1;
        // if statement
        if (j > 0) {
            System.out.println("groter");
        } else {
            System.out.println("kleiner");
        }

        // lambda is ook een expression:
        int y = 42;
        Function<Integer, Integer> f = x -> x * x;
    }
}
