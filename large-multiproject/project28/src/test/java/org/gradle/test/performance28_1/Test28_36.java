package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_36 {
    private final Production28_36 production = new Production28_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}