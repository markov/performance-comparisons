package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16065 {
    private final Productionnull_16065 production = new Productionnull_16065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}