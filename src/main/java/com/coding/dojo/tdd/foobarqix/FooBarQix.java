package com.coding.dojo.tdd.foobarqix;

//https://codingdojo.org/kata/FooBarQix/

public class FooBarQix {


    public FooBarQix() {

    }

    String compute(String s) {
        final StringBuilder stringBuilder = new StringBuilder();

        if (Integer.parseInt(s) % 3 == 0) {
            stringBuilder.append("Foo");
        }
        if (Integer.parseInt(s) % 5 == 0) {
            stringBuilder.append("Bar");
        }
        if (Integer.parseInt(s) % 7 == 0) {
            stringBuilder.append("Qix");
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
