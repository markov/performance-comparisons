package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_273 {
    private final Production25_273 production = new Production25_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}