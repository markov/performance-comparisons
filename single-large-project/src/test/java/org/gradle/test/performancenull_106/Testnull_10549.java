package org.gradle.test.performancenull_106;

import static org.junit.Assert.*;

public class Testnull_10549 {
    private final Productionnull_10549 production = new Productionnull_10549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}