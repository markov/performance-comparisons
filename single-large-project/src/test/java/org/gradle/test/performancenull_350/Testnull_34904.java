package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34904 {
    private final Productionnull_34904 production = new Productionnull_34904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}