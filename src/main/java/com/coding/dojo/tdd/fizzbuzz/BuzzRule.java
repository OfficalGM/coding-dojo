package com.coding.dojo.tdd.fizzbuzz;

public class BuzzRule extends Rule {

    public final static String WORD = "Buzz";

    @Override
    String apply(int num) {
        return num % 5 == 0 ? WORD : "";
    }
}
