package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_82 {
    private final Production76_82 production = new Production76_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}