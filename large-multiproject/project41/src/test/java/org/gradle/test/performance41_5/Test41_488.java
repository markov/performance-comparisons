package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_488 {
    private final Production41_488 production = new Production41_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}