package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_221 {
    private final Production67_221 production = new Production67_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}