package com.coding.dojo.tdd.foobarqix;

public class BarRule implements Rule {

    @Override
    public String apply(String s) {
        return Integer.parseInt(s) % 5 == 0 ? "Bar" : "";
    }
}
