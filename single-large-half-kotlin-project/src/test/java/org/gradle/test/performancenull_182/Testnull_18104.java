package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18104 {
    private final Productionnull_18104 production = new Productionnull_18104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}