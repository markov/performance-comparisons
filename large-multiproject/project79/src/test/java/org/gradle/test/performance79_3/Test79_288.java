package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_288 {
    private final Production79_288 production = new Production79_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}