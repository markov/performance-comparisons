package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_473 {
    private final Production56_473 production = new Production56_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}