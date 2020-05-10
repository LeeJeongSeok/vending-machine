package com.lee.practice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkTest {

    @Test
    public void drink_get_setTest() {

        Drink drink = new Drink("아메리카노", 2000);

        assertThat("아메리카노").isEqualTo(drink.getDrink());
        assertThat(2000).isEqualTo(drink.getPrice());

    }
}
