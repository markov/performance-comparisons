package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_425 {
    private final Production96_425 production = new Production96_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}