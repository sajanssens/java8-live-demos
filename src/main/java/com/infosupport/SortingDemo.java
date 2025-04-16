package com.infosupport;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }
}
