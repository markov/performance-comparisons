package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33056 {
    private final Productionnull_33056 production = new Productionnull_33056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}