package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_363 {
    private final Production14_363 production = new Production14_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}