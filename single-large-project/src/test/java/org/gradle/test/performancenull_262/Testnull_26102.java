package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26102 {
    private final Productionnull_26102 production = new Productionnull_26102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}