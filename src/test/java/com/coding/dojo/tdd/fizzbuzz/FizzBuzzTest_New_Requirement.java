package com.coding.dojo.tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FizzBuzzTest_New_Requirement {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void before() {
        FizzRule fizzRule = new FizzRule2();
        BuzzRule buzzRule = new BuzzRule2();
        fizzBuzz = new FizzBuzz(List.of(fizzRule, buzzRule));
    }

    @Test
    public void test_speak_not_equal_3() {

        int num = 1;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("" + num);

    }

    @Test
    public void test_speak_Fizz() {

        int num = 3;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("Fizz");

    }

    @Test
    public void test_speak_Fizz_given_13() {

        int num = 13;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("Fizz");

    }

    @Test
    public void test_speak_Buzz() {

        int num = 5;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void test_speak_Buzz_given_25() {

        int num = 25;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void test_speak_FizzBuzz() {

        int num = 15;

        String result = fizzBuzz.speak(num);

        assertThat(result).isEqualTo("FizzBuzz");
    }
}