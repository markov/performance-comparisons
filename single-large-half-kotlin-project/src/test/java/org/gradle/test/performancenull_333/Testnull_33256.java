package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33256 {
    private final Productionnull_33256 production = new Productionnull_33256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}