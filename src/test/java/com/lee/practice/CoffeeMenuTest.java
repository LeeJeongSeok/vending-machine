package com.lee.practice;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMenuTest {

    Map<String, Integer> coffeeMenu;

    @Test
    public void 메뉴판_초기화() {
        coffeeMenu = new HashMap<>();

        coffeeMenu.put("아메리카노", 2000);
        coffeeMenu.put("카페 라때", 2500);
        coffeeMenu.put("카라멜 마끼야또", 3000);
    }

    @Test
    public void 음료_주문() throws Exception{

        Drink drink = new Drink("아메리카노", 2000);


    }

    @Test
    public void 주문_음료_가격_출력() {
        CoffeeMenu coffeeMenu = new CoffeeMenu();;
    }
}
