package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_451 {
    private final Production31_451 production = new Production31_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}