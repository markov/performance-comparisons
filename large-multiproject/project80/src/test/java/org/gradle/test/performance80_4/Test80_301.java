package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_301 {
    private final Production80_301 production = new Production80_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}