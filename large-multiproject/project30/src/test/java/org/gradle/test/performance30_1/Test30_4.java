package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_4 {
    private final Production30_4 production = new Production30_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}