package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_278 {
    private final Production68_278 production = new Production68_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}