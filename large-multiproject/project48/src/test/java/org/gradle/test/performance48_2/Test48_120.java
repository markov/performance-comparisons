package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_120 {
    private final Production48_120 production = new Production48_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}