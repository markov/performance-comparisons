package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_101 {
    private final Production60_101 production = new Production60_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}