package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20282 {
    private final Productionnull_20282 production = new Productionnull_20282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}