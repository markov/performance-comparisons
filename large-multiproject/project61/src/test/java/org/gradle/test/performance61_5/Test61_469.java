package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_469 {
    private final Production61_469 production = new Production61_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}