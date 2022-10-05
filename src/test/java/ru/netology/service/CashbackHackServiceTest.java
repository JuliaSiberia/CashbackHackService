package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
public class CashbackHackServiceTest {

    @Test
    public void purchase900() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchase1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}