package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_321 {
    private final Production39_321 production = new Production39_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}