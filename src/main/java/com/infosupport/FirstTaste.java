package com.infosupport;

import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstTaste {

    public static void main(String[] args) {
        // Paradigma's:
        // 1. Declaratief - Verklarend - WAT, het is zo
        //      - Functioneel
        //      - Logisch
        // 2. Imperatief  - Dicterend  - HOE, commando's
        //      - OO - static
        //      - Procedureel

        // f(x)  = x ^ 2
        // f: x -> x ^ 2
        // f(2) = 4
        // f(3) = 9

        Function<Integer, Integer> f = x -> x * x;
        int result = f.apply(2);

        List<Integer> source = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // List<Integer> r =
        source.stream()                  // 1 create: from source, genereren --> ObjectStream (Stream<T>) of PrimitiveStream (Int/Double/LongStream)
                .filter(i -> i % 2 == 0) // 2 intermediate ops: stateless / stateful, short circuiting (of niet)
                .map(FirstTaste::square)
                .distinct()
                .limit(3) // Stateful and SC.
                .sorted() // Stateful
                .peek(System.out::println)
                .max(Integer::compare);
        // .reduce(0, Integer::sum) // folding

        // .collect(Collectors.toList())
        // .forEach(System.out::println)

        // 3 terminal ops: forEach (opeten) EN reduce (reduceert alle elementen tot één ding),
        //                 collect is een speciale vorm van reduce
        ;

        source.stream()
                .mapToInt(i -> i.intValue())
                .average();

        Stream.of(new Person("Koen", 25), new Person("Bram", 45))
                .mapToInt(Person::getAge)
                .boxed();

        source.stream()
                .mapToInt(Integer::intValue)
                .mapToObj(a -> new Person("Koen", a))
                .collect(Collectors.partitioningBy(p -> p.getName().equals("Koen") || p.getName().equals("Bram")));

        Stream.generate(() -> 1)
                .limit(5)
                ;

        // Stream.iterate(0, i -> i < 100, i -> i + 1)
        //         .;
    }

    public static int square(Integer x) {
        return x * x;
    }
}
