package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_87 {
    private final Production13_87 production = new Production13_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}