package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1142 {
    private final Productionnull_1142 production = new Productionnull_1142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}