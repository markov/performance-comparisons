package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_279 {
    private final Production76_279 production = new Production76_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}