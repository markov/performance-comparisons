package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21029 {
    private final Productionnull_21029 production = new Productionnull_21029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}