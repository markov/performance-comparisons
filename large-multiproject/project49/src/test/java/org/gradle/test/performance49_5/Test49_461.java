package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_461 {
    private final Production49_461 production = new Production49_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}