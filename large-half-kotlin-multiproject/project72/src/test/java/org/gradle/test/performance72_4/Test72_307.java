package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_307 {
    private final Production72_307 production = new Production72_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}