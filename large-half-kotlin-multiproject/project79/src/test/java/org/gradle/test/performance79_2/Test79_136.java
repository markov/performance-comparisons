package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_136 {
    private final Production79_136 production = new Production79_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}