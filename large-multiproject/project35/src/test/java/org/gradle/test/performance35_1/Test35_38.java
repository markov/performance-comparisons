package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_38 {
    private final Production35_38 production = new Production35_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}