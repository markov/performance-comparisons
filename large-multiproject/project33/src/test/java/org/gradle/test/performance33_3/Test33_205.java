package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_205 {
    private final Production33_205 production = new Production33_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}