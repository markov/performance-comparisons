package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_302 {
    private final Production61_302 production = new Production61_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}