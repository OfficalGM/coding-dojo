package com.coding.dojo.tdd.fizzbuzz;

// https://codingdojo.org/kata/FizzBuzz/


import java.util.List;

public class FizzBuzz {

    private final List<Rule> ruleList;


    public FizzBuzz(List<Rule> ruleList) {
        this.ruleList = ruleList;
    }

    public String speak(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Rule rule : ruleList) {
            if (rule.check(num)) {
                stringBuilder.append(rule.getWord());
            }
        }
        final String result = stringBuilder.toString();
        return result.length() > 0 ? result: "" + num;
    }


}
