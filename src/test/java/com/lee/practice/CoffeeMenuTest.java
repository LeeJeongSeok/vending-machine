package com.lee.practice;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMenuTest {

    Map<String, Integer> coffeeMenu;

    @Before
    public void init() {
        coffeeMenu = new HashMap<>();
    }

    @Test
    public void 메뉴판_테스트() {
        coffeeMenu.put("아메리카노", 2000);
        coffeeMenu.put("카페 라때", 2500);
        coffeeMenu.put("카라멜 마끼야또", 3000);
    }

    @Test
    public void 주문_음료_확인() {
        //given
        coffeeMenu.put("아메리카노", 2000);
        coffeeMenu.put("카페 라때", 2500);
        coffeeMenu.put("카라멜 마끼야또", 3000);

        //when
        Drink drink = new Drink("아메리카노");
        drink.setPrice(coffeeMenu.get("아메리카노"));

        //then
        assertThat(coffeeMenu.get(drink.getDrink())).isEqualTo(drink.getPrice());

    }
}
