package com.lee.practice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMenuTest {

    String[] coffee = {"아메리카노", "카페 라때", "카라멜 마끼야또"};
    int[] price = {2000, 2500, 3000};

    @Test
    public void 사용자가_주문한_음료가_있는가() throws Exception{
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        assertThat(true).isEqualTo(coffeeMenu.searchMenu(coffee[0]));
    }

    @Test
    public void 주문_음료_가격_출력() {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.showOrderList(coffee[0], price[0]);
        coffeeMenu.showOrderList(coffee[1], price[1]);
        coffeeMenu.showOrderList(coffee[2], price[2]);
    }
}