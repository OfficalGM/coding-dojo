package com.coding.dojo.tdd.poter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class PriceCalculatorTest {

    PriceCalculator priceCalculator;

    @BeforeEach
    public void init() {
        this.priceCalculator = new PriceCalculator();
    }

    @Test
    public void calculate_buy_different_1() {

        final List<ShoppingItem> givenBookList = List.of(new ShoppingItem(new Book("first", 8), 1));

        final double totalPrice = priceCalculator.calculate(givenBookList);

        assertThat(totalPrice).isEqualTo(8d);
    }

    @Test
    public void calculate_buy_different_2() {

        final List<ShoppingItem> givenBookList = List.of(new ShoppingItem(new Book("first", 8), 1),new ShoppingItem(new Book("second", 8), 1));

        final double totalPrice = priceCalculator.calculate(givenBookList);

        assertThat(totalPrice).isEqualTo(15.20);
    }

    @Test
    public void calculate_buy_different_3() {

        final List<ShoppingItem> givenBookList = List.of(new ShoppingItem(new Book("first", 8), 1),new ShoppingItem(new Book("second", 8), 1),new ShoppingItem(new Book("third", 8), 1));

        final double totalPrice = priceCalculator.calculate(givenBookList);

        assertThat(totalPrice).isEqualTo(21.60);
    }

    @Test
    public void calculate_buy_same_two_book() {

        final List<ShoppingItem> givenBookList = List.of(new ShoppingItem(new Book("first", 8), 2));

        final double totalPrice = priceCalculator.calculate(givenBookList);

        assertThat(totalPrice).isEqualTo(16);
    }


}