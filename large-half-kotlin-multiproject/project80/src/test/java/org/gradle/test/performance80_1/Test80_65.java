package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_65 {
    private final Production80_65 production = new Production80_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}