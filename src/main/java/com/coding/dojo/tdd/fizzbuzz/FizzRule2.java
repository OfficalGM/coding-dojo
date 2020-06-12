package com.coding.dojo.tdd.fizzbuzz;

public class FizzRule2 extends FizzRule {

    @Override
    public String apply(int num) {
        return isModThreeEqualZero(num) || hasThreeIncludeNumber(num) ? WORD : "";
    }

    boolean hasThreeIncludeNumber(int num) {
        final String[] splitNumber = ("" + num).split("");
        for (String n : splitNumber) {
            if (n.equalsIgnoreCase("3"))
                return true;
        }
        return false;
    }

}
