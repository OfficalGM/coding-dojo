package com.coding.dojo.tdd.fizzbuzz;

public class FizzRule extends Rule {

    public final static String WORD = "Fizz";

    @Override
    String apply(int num) {
        return num % 3 == 0 ? WORD : "";
    }


}
