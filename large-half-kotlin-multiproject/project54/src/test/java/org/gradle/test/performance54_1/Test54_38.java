package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_38 {
    private final Production54_38 production = new Production54_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}