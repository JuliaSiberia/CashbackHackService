package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void purchase500() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

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