package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_413 {
    private final Production72_413 production = new Production72_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}