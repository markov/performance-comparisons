package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_44 {
    private final Production56_44 production = new Production56_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}