package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_132 {
    private final Production36_132 production = new Production36_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}