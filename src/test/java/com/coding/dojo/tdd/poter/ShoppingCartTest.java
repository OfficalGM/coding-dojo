package com.coding.dojo.tdd.poter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartTest {

    ShoppingCart shoppingCart;

    @BeforeEach
    public void init() {
        shoppingCart = new ShoppingCart(new PriceCalculator());
    }

    @Test
    public void getTotalPrice_empty() {

        double totalPrice = shoppingCart.getTotalPrice();

        assertThat(totalPrice).isEqualTo(0.0D);
    }

    @Test
    public void getTotalPrice_one_book() {

        shoppingCart.add(new ShoppingItem(new Book("first", 8), 1));

        double totalPrice = shoppingCart.getTotalPrice();

        assertThat(totalPrice).isEqualTo(8.0D);
    }

}