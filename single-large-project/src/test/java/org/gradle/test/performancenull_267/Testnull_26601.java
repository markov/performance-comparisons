package org.gradle.test.performancenull_267;

import static org.junit.Assert.*;

public class Testnull_26601 {
    private final Productionnull_26601 production = new Productionnull_26601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}