package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20044 {
    private final Productionnull_20044 production = new Productionnull_20044("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}