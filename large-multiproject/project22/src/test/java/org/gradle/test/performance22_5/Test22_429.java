package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_429 {
    private final Production22_429 production = new Production22_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}