package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41382 {
    private final Productionnull_41382 production = new Productionnull_41382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}