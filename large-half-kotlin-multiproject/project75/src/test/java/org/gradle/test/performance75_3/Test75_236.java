package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_236 {
    private final Production75_236 production = new Production75_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}