package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_56 {
    private final Production55_56 production = new Production55_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}