package com.coding.dojo.tdd.fizzbuzz;

public class BuzzRule implements Rule {

    public final static String WORD = "Buzz";

    @Override
    public String apply(int num) {
        return isModFiveEqualZero(num) ? WORD : "";
    }

    boolean isModFiveEqualZero(int num) {
        return num % 5 == 0;
    }

}
