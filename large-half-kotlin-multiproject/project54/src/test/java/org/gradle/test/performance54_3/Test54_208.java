package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_208 {
    private final Production54_208 production = new Production54_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}