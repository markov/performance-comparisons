package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12946 {
    private final Productionnull_12946 production = new Productionnull_12946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}