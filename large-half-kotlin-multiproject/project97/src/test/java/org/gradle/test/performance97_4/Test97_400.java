package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_400 {
    private final Production97_400 production = new Production97_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}