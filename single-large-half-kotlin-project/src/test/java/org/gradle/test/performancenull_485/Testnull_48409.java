package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48409 {
    private final Productionnull_48409 production = new Productionnull_48409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}