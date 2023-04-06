package Junit4Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {


    @Test
    public void addNumber() {

        int actual = Calculator.addNumber(10,10);
        int excepted = 20;

        Assert.assertEquals(actual,excepted);
    }

    @Test
    public void mulNumber() {

        int actual= Calculator.mulNumber(10,10);
        int excepted=100;

        Assert.assertEquals(actual,excepted);
    }

    @Test
    public void subNumber() {

        int actual=Calculator.subNumber(10,10);
        int excepted = 0;

        Assert.assertEquals(actual,excepted);
    }

    @Test
    public void divNumber() {

        int actual = Calculator.divNumber(100,10);
        int excepted = 10;

        Assert.assertEquals(actual,excepted);
    }
}