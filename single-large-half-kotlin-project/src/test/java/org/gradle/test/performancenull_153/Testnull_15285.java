package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15285 {
    private final Productionnull_15285 production = new Productionnull_15285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}