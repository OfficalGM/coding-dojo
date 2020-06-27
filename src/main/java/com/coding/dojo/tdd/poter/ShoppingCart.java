package com.coding.dojo.tdd.poter;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final PriceCalculator priceCalculator;

    private final List<ShoppingItem> shoppingItemList;

    public ShoppingCart(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
        this.shoppingItemList = new ArrayList<>();
    }

    public void add(ShoppingItem shoppingItem) {
        this.shoppingItemList.add(shoppingItem);
    }

    public double getTotalPrice() {
        return priceCalculator.calculate(this.shoppingItemList);
    }


}
