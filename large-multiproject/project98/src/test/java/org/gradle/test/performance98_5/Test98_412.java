package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_412 {
    private final Production98_412 production = new Production98_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}