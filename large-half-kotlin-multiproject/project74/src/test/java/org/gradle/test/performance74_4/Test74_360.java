package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_360 {
    private final Production74_360 production = new Production74_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}