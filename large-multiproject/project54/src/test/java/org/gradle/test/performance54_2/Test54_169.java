package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_169 {
    private final Production54_169 production = new Production54_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}