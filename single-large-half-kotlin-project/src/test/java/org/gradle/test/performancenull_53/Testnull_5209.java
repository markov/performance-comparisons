package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5209 {
    private final Productionnull_5209 production = new Productionnull_5209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}