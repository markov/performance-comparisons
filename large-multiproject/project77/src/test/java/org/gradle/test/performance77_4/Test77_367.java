package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_367 {
    private final Production77_367 production = new Production77_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}