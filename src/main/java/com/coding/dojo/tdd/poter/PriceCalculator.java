package com.coding.dojo.tdd.poter;

import java.util.List;

public class PriceCalculator {

    public PriceCalculator() {

    }

    public double calculate(List<ShoppingItem> shoppingItemList) {
        return shoppingItemList.size() * 8 * (1 - (shoppingItemList.size() - 1) * 0.05);
    }

}
