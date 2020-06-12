package com.coding.dojo.tdd.fizzbuzz;

public class FizzRule extends Rule {

    @Override
    String getWord() {
        return "Fizz";
    }

    @Override
    public boolean check(int num) {
        return num % 3 == 0;
    }
}
