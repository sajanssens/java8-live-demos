package com.infosupport;

public class TypesInJava {
    public static void main(String[] args) {
        // primitive types:
        byte getal1 = 5;
        char getal2 = 5;
        short getal3 = 5;
        int getal = 5;
        long getal5 = 5;
        float getal6 = 5.5f;
        double getal7 = 5.5;
        boolean getal8 = true;

        // adres = referentie = reference types
        Integer getal9 = Integer.valueOf(5);

        Person b = new Person("Bram", 45);
        b.drinkCoffee();
        String name = b.getName();
    }
}
