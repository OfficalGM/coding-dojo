package com.coding.dojo.tdd.foobarqix;

//https://codingdojo.org/kata/FooBarQix/

import java.util.List;
import java.util.function.Function;

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
        if (s.contains("7")) {
            stringBuilder.append("Qix");
        }
        if (s.contains("5")) {
            stringBuilder.append("Bar");
        }
        if (s.contains("3")) {
            stringBuilder.append("Foo");
        }

        return stringBuilder.toString().length() > 0 ? stringBuilder.toString() : s;
    }
}
