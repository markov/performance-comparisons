package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_347 {
    private final Production98_347 production = new Production98_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}