package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_291 {
    private final Production96_291 production = new Production96_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}