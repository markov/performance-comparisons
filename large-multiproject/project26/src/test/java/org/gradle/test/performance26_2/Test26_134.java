package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_134 {
    private final Production26_134 production = new Production26_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}