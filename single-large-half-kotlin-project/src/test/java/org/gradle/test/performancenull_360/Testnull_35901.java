package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35901 {
    private final Productionnull_35901 production = new Productionnull_35901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}