package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5987 {
    private final Productionnull_5987 production = new Productionnull_5987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}