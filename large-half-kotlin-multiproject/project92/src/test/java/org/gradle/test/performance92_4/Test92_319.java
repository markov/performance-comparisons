package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_319 {
    private final Production92_319 production = new Production92_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}