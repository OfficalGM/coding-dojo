package com.coding.dojo.tdd.fizzbuzz;

public class BuzzRule extends Rule {

    @Override
    String getWord() {
        return "Buzz";
    }

    @Override
    public boolean check(int num) {
        return num % 5 == 0;
    }

}
