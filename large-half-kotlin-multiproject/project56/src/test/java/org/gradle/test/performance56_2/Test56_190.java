package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_190 {
    private final Production56_190 production = new Production56_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}