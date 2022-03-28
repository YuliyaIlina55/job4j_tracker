package ru.job4j.oop;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000to222then3dot46() {
        double expected = 3.46;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}