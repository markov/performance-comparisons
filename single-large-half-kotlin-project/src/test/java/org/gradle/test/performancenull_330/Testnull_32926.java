package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32926 {
    private final Productionnull_32926 production = new Productionnull_32926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}