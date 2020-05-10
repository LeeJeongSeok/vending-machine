package com.lee.practice;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

    @Before
    public void setUpMenu() {

    }

    @Test
    public void 메뉴_출력() {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.showMenu();
    }

    @Test
    public void 사용자가_주문한_음료가_있는가() {
        CoffeeMenu coffeeMenu = new CoffeeMenu();

        String[] coffee = {"아메리카노", "카페 라때", "카라멜 마끼야또"};
        int[] price = {2000, 2500, 3000};

        assertThat(true).isEqualTo(coffeeMenu.searchMenu(coffee[0]));
    }
}
