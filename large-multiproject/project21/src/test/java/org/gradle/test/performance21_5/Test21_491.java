package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_491 {
    private final Production21_491 production = new Production21_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}