package com.lee.practice;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User();
    }

    @Test
    public void 돈을_투입한다() {
        user.insertMoney(1);
    }

    @Test
    public void 주문하기() {
        user.orderToMachine(1);
    }
}
