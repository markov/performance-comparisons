package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36002 {
    private final Productionnull_36002 production = new Productionnull_36002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}