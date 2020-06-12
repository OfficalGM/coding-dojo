package com.coding.dojo.tdd;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzTest {

    @Test
    public void test_speak_not_equal_3() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        int num = 1;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("" + num);

    }

    @Test
    public void test_speak_Fizz() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        int num = 3;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("Fizz");

    }

    @Test
    public void test_speak_Buzz() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        int num = 5;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void test_speak_FizzBuzz() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        int num = 15;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("FizzBuzz");
    }


}
