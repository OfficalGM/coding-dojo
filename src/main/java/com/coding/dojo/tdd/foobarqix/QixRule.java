package com.coding.dojo.tdd.foobarqix;

public class QixRule implements Rule {
    @Override
    public String apply(String s) {
        return Integer.parseInt(s) % 7 == 0 ? "Qix" : "";
    }
}
