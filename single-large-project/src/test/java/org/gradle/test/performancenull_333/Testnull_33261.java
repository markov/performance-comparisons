package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33261 {
    private final Productionnull_33261 production = new Productionnull_33261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}