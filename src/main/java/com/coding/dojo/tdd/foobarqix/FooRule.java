package com.coding.dojo.tdd.foobarqix;

public class FooRule implements Rule {

    @Override
    public String apply(String s) {
        return Integer.parseInt(s) % 3 == 0 ? "Foo" : "";
    }
}
