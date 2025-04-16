package com.infosupport;

public class MeaningOfThis {

    public int value = 4;

    public void doIt() {
        int value = 6;
        value++;
        int finalValue = value;
        Runnable r = () -> {
            // value = 10;
            System.out.println(finalValue);
        };
        r.run();
    }

    public static void main(String... args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}
