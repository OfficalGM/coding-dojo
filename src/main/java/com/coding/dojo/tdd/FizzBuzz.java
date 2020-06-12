package com.coding.dojo.tdd;

// https://codingdojo.org/kata/FizzBuzz/

public class FizzBuzz {

    public FizzBuzz() {

    }


    public String speak(int num) {
        if (isModThreeAndFiveEqualZero(num)) {
            return "FizzBuzz";
        }
        if (isModThreeEqualZero(num)) {
            return "Fizz";
        }
        if (isModFiveEqualZero(num)) {
            return "Buzz";
        }
        return "" + num;
    }

    private boolean isModThreeAndFiveEqualZero(int num) {
        return isModThreeEqualZero(num) && isModFiveEqualZero(num);
    }

    private boolean isModThreeEqualZero(int num) {
        return num % 3 == 0;
    }

    private boolean isModFiveEqualZero(int num) {
        return num % 5 == 0;
    }

}
