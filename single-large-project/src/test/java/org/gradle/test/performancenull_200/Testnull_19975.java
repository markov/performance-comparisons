package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19975 {
    private final Productionnull_19975 production = new Productionnull_19975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}