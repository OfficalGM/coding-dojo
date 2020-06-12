package com.coding.dojo.tdd.fizzbuzz;

public class FizzRule implements Rule {

    public final static String WORD = "Fizz";

    @Override
    public String apply(int num) {
        return isModThreeEqualZero(num) ? WORD : "";
    }

    boolean isModThreeEqualZero(int num) {
        return num % 3 == 0;
    }

}
