package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_50 {
    private final Production83_50 production = new Production83_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}