package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_394 {
    private final Production63_394 production = new Production63_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}