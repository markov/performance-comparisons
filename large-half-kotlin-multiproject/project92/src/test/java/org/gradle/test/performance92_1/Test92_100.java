package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_100 {
    private final Production92_100 production = new Production92_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}