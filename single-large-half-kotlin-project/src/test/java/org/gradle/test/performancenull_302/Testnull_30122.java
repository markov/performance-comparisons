package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30122 {
    private final Productionnull_30122 production = new Productionnull_30122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}