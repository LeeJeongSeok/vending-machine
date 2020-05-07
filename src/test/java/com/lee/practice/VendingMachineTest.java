package com.lee.practice;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class VendingMachineTest {

    // 잔액확인
    @Test
    public void testGetBalance() throws Exception{
        VendingMachine machine = new VendingMachine();
        machine.putMoney(10000);
        assertThat(10000).isEqualTo(machine.getBalance());
    }

    //거스름만 반환
    @Test
    public void 음료_추가_선택_후_거스름돈_반환() throws Exception {
        VendingMachine machine = new VendingMachine();
        machine.putMoney(10000);

        machine.selectDrink(new Drink("Ice Latte", 2000));
        machine.selectDrink(new Drink("Ice Latte", 2000));

        machine.setBalance(6000);

        assertThat(6000).isEqualTo(machine.getBalance());

        machine.selectDrink(new Drink("Ice Latte", 2000));

        assertThat(4000).isEqualTo(machine.getBalance());

    }

}
