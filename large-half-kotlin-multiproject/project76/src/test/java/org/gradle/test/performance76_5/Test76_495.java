package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_495 {
    private final Production76_495 production = new Production76_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}