package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_145 {
    private final Production98_145 production = new Production98_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}