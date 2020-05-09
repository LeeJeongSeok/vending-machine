package com.lee.practice;

import org.junit.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

    @Test
    public void 메뉴_출력() {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.showMenu();
    }

    @Test
    public void 사용자_입력() {
        Scanner scanner = new Scanner(System.in);
        String coffee = scanner.next();
        int price = scanner.nextInt();

        assertThat(coffee).isEqualTo("아메리카노");
        assertThat(price).isEqualTo(3000);
    }
}
