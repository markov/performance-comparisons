package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_113 {
    private final Production24_113 production = new Production24_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}