package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_196 {
    private final Production24_196 production = new Production24_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}