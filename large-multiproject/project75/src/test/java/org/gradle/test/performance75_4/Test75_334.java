package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_334 {
    private final Production75_334 production = new Production75_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}