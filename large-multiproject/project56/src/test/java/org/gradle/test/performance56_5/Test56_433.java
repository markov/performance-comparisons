package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_433 {
    private final Production56_433 production = new Production56_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}