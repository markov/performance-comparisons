package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_128 {
    private final Production97_128 production = new Production97_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}