package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6289 {
    private final Productionnull_6289 production = new Productionnull_6289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}