package com.zhangqi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Redhahaha {
    @Test
    public void testSum() {
        Red calculator = new Red();
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }
}
