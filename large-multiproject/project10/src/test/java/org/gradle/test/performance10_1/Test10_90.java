package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_90 {
    private final Production10_90 production = new Production10_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}