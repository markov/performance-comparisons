package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_362 {
    private final Production96_362 production = new Production96_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}