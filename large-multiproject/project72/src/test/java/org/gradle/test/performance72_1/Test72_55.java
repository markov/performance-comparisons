package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_55 {
    private final Production72_55 production = new Production72_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}