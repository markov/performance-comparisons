package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_42 {
    private final Production88_42 production = new Production88_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}