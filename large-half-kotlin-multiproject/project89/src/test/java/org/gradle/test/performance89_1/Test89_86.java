package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_86 {
    private final Production89_86 production = new Production89_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}