package com.coding.dojo.tdd.poter;

import java.util.List;

public class PriceCalculator {

    public PriceCalculator() {

    }

    public double calculate(List<ShoppingItem> shoppingItemList) {
        double totalPrice = 0;
        for (ShoppingItem item : shoppingItemList) {
            totalPrice += item.getQuantity() * item.getBook().getPrice();
        }
        double disCount = 1 - (shoppingItemList.size() - 1) * 0.05;
        return totalPrice * disCount;
    }

}
