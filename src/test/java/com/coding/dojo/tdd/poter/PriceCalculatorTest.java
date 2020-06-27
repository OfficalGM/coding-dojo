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
    public void calculate_buy_1() {

        final List<Book> givenBookList = List.of(new Book("first", 8));

        final double totalPrice = priceCalculator.calculate(givenBookList);

        assertThat(totalPrice).isEqualTo(8d);
    }

    
}