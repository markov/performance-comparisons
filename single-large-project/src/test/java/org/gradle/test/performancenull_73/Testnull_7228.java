package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7228 {
    private final Productionnull_7228 production = new Productionnull_7228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}