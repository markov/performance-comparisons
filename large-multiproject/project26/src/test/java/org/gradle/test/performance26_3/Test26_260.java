package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_260 {
    private final Production26_260 production = new Production26_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}