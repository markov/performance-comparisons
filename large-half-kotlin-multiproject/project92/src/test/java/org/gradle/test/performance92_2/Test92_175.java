package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_175 {
    private final Production92_175 production = new Production92_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}