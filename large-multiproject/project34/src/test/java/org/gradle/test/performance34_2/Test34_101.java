package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_101 {
    private final Production34_101 production = new Production34_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}