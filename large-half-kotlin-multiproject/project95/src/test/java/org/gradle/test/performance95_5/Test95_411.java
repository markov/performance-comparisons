package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_411 {
    private final Production95_411 production = new Production95_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}