package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_148 {
    private final Production30_148 production = new Production30_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}