package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3139 {
    private final Productionnull_3139 production = new Productionnull_3139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}