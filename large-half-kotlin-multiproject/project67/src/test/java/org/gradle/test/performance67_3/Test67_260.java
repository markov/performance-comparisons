package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_260 {
    private final Production67_260 production = new Production67_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}