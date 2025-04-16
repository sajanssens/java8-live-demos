package com.infosupport;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void name() {
        Person john = new Person("John", 25);
        john.drinkCoffee();

        Person.maxAge();
        john.drinkCoffee();
    }
}