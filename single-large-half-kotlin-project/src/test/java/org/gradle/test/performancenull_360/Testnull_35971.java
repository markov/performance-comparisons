package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35971 {
    private final Productionnull_35971 production = new Productionnull_35971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}