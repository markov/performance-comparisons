package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_385 {
    private final Production25_385 production = new Production25_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}