package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1204 {
    private final Productionnull_1204 production = new Productionnull_1204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}