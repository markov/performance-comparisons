package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_444 {
    private final Production67_444 production = new Production67_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}