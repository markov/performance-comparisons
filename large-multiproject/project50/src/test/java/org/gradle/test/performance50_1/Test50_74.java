package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_74 {
    private final Production50_74 production = new Production50_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}