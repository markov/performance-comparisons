package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_196 {
    private final Production58_196 production = new Production58_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}