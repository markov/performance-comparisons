package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_82 {
    private final Production61_82 production = new Production61_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}