package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22073 {
    private final Productionnull_22073 production = new Productionnull_22073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}