package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42469 {
    private final Productionnull_42469 production = new Productionnull_42469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}