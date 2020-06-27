package com.coding.dojo.tdd.poter;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ShoppingItem {

    private Book book;
    private int quantity;

}
