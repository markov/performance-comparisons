package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30026 {
    private final Productionnull_30026 production = new Productionnull_30026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}