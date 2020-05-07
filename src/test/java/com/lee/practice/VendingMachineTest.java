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

    //거스름
    @Test
    public void testReturnBalance() throws Exception {
        VendingMachine machine = new VendingMachine();
        machine.putMoney(10000);

        machine.selectDrink(new Drink("Coffee", 1000));

        MoneyChange moneyChange = new MoneyChange();
        moneyChange.addChange(1000);

        assertThat(9000).isEqualTo(machine.getBalance() - moneyChange.getBalance());

    }




}
