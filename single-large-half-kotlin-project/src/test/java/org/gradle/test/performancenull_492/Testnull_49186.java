package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49186 {
    private final Productionnull_49186 production = new Productionnull_49186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}