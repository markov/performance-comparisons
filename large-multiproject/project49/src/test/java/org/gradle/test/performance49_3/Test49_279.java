package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_279 {
    private final Production49_279 production = new Production49_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}