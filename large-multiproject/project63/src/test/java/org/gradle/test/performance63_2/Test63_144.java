package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_144 {
    private final Production63_144 production = new Production63_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}