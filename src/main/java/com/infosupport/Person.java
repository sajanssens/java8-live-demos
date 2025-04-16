package com.infosupport;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drinkCoffee() {
        System.out.println("Drinking coffee");
        age++;
    }

    public static int maxAge() { // los van objects
        return 130;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }

    @Override public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
