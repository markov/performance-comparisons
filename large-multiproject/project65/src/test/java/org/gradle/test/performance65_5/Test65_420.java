package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_420 {
    private final Production65_420 production = new Production65_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}