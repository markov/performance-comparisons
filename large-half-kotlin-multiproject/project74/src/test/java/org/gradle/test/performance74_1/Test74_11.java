package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_11 {
    private final Production74_11 production = new Production74_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}