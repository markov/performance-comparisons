package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25911 {
    private final Productionnull_25911 production = new Productionnull_25911("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}