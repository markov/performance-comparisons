package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_101 {
    private final Production93_101 production = new Production93_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}