package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42238 {
    private final Productionnull_42238 production = new Productionnull_42238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}