package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_379 {
    private final Production63_379 production = new Production63_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}