package com.zhangqi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreenTestCase {

    @Test
    public void testIsGreen() {
        Green green = new Green();
        Boolean result = green.isGreen(true);
        assertEquals(true, result);
    }
}

