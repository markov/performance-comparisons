package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_156 {
    private final Production28_156 production = new Production28_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}