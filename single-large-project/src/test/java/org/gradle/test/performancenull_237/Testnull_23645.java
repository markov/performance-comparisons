package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23645 {
    private final Productionnull_23645 production = new Productionnull_23645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}