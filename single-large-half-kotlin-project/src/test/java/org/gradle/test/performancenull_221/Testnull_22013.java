package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22013 {
    private final Productionnull_22013 production = new Productionnull_22013("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}