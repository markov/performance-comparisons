package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41471 {
    private final Productionnull_41471 production = new Productionnull_41471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}