package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_368 {
    private final Production77_368 production = new Production77_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}