package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_302 {
    private final Production20_302 production = new Production20_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}