package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3123 {
    private final Productionnull_3123 production = new Productionnull_3123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}