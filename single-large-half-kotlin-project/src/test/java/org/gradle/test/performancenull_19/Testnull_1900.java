package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1900 {
    private final Productionnull_1900 production = new Productionnull_1900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}