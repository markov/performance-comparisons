package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_452 {
    private final Production10_452 production = new Production10_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}