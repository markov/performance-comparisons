package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_235 {
    private final Production27_235 production = new Production27_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}