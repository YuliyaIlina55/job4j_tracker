package ru.job4j.oop;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        Max max = new Max();
        int result = max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        Max max = new Max();
        int result = max.max(first, max.max(second, third));
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To4To3To4Then4() {
        int first = 1;
        int second = 4;
        int third = 3;
        int fourth = 4;
        Max max = new Max();
        int result = max.max(max.max(first, second), max.max(third, fourth));
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}