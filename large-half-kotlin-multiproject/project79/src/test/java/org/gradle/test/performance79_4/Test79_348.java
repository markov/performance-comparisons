package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_348 {
    private final Production79_348 production = new Production79_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}