package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_64 {
    private final Production17_64 production = new Production17_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}