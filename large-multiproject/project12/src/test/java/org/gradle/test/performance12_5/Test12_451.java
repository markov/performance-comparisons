package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_451 {
    private final Production12_451 production = new Production12_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}