package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_185 {
    private final Production48_185 production = new Production48_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}