package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25184 {
    private final Productionnull_25184 production = new Productionnull_25184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}