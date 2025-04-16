package com.infosupport;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class RecursionDemoTest implements WithAssertions {

    private final RecursionDemo recursionDemo = new RecursionDemo();

    @Test
    void imperative() {
        int actual = recursionDemo.imperative(10);
        assertThat(actual).isEqualTo(55);
    }

    @Test
    void recursive() {
        int actual = recursionDemo.recursive(10);
        assertThat(actual).isEqualTo(55);
    }

    @Test
    void factorial() {
        int actual = recursionDemo.factorial(5);
        assertThat(actual).isEqualTo(120);
    }
}