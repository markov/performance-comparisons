package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_119 {
    private final Production83_119 production = new Production83_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}