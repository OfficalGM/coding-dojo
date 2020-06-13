package com.coding.dojo.tdd.foobarqix;

public class FooContainRule implements Rule {
    @Override
    public String apply(String s) {
        return null;
    }
    //FIXME
    boolean hasThreeIncludeNumber(int num) {
        final String[] splitNumber = ("" + num).split("");
        for (String n : splitNumber) {
            if (n.equalsIgnoreCase("3"))
                return true;
        }
        return false;
    }
}
