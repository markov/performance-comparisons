package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_453 {
    private final Production20_453 production = new Production20_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}