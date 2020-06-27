package com.coding.dojo.tdd.poter;

import java.util.List;

public class PriceCalculator {

    public double calculate(List<ShoppingItem> shoppingItemList) {
        int totalItemCount = 0;
        for (ShoppingItem item : shoppingItemList) {
            totalItemCount += item.getQuantity();
        }
        double disCount = 1 - (shoppingItemList.size() - 1) * 0.05;
        double totalPrice = (totalItemCount - shoppingItemList.size()) * 8 + disCount * 8 * shoppingItemList.size();
        return totalPrice;
    }

}
