package com.coding.dojo.tdd.foobarqix;

//https://codingdojo.org/kata/FooBarQix/

import java.util.List;

public class FooBarQix {

    private final List<Rule> ruleList;

    public FooBarQix(List<Rule> ruleList) {
        this.ruleList = ruleList;
    }

    String compute(String s) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (Rule r : ruleList) {
            stringBuilder.append(r.apply(s));
        }
        return stringBuilder.toString().length() > 0 ? stringBuilder.toString() : s;
    }
}
