package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_400 {
    private final Production43_400 production = new Production43_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}