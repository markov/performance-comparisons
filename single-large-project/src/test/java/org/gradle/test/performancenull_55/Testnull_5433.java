package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5433 {
    private final Productionnull_5433 production = new Productionnull_5433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}