package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_454 {
    private final Production89_454 production = new Production89_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}