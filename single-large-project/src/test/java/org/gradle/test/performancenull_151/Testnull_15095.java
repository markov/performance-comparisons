package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15095 {
    private final Productionnull_15095 production = new Productionnull_15095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}