package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6219 {
    private final Productionnull_6219 production = new Productionnull_6219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}