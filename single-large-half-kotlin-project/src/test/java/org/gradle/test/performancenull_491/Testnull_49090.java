package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49090 {
    private final Productionnull_49090 production = new Productionnull_49090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}