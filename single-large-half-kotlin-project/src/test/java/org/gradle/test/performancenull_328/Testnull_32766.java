package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32766 {
    private final Productionnull_32766 production = new Productionnull_32766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}