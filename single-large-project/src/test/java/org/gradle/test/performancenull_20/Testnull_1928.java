package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1928 {
    private final Productionnull_1928 production = new Productionnull_1928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}