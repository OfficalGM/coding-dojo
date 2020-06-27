package com.coding.dojo.tdd.poter;

import java.util.List;

public class PriceCalculator {

    public PriceCalculator() {

    }

    public double calculate(List<Book> bookList) {
        return bookList.size() * 8 * (1 - (bookList.size() - 1) * 0.05);
    }


}
