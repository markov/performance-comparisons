package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_114 {
    private final Production98_114 production = new Production98_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}