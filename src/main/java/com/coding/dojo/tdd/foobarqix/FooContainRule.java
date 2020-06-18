package com.coding.dojo.tdd.foobarqix;

public class FooContainRule implements Rule {

    @Override
    public String apply(String s) {
        int count = calculateThreeNumberContainIn(Integer.parseInt(s));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append("Foo");
        }
        return stringBuilder.toString();
    }

    int calculateThreeNumberContainIn(int num) {
        final String[] splitNumber = ("" + num).split("");
        int resultCount = 0;
        for (String n : splitNumber) {
            if (n.equalsIgnoreCase("3"))
                resultCount++;
        }
        return resultCount;
    }
}
