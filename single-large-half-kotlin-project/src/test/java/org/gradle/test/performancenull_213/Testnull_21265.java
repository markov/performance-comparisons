package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21265 {
    private final Productionnull_21265 production = new Productionnull_21265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}