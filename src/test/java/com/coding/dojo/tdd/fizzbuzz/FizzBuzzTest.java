package com.coding.dojo.tdd.fizzbuzz;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void before() {
        FizzRule fizzRule = new FizzRule();
        BuzzRule buzzRule = new BuzzRule();
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
    public void test_speak_Buzz() {

        int num = 5;

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
