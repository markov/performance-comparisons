package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_446 {
    private final Production58_446 production = new Production58_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}