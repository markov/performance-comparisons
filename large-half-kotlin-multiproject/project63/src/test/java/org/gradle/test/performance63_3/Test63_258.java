package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_258 {
    private final Production63_258 production = new Production63_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}