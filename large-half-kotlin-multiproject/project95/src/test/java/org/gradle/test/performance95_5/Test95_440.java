package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_440 {
    private final Production95_440 production = new Production95_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}