package com.coding.dojo.tdd.fizzbuzz;

// https://codingdojo.org/kata/FizzBuzz/


import java.util.List;

public class FizzBuzz {

    private final List<Rule> ruleList;

    public FizzBuzz(List<Rule> ruleList) {
        this.ruleList = ruleList;
    }

    public String speak(int num) {
        StringBuilder result = new StringBuilder();
        for (Rule r : ruleList) {
            result.append(r.apply(num));
        }
        return result.length() > 0 ? result.toString() : "" + num;
    }

}
