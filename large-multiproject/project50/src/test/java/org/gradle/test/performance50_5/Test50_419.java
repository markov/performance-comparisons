package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_419 {
    private final Production50_419 production = new Production50_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}