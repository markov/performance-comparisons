package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_246 {
    private final Production31_246 production = new Production31_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}