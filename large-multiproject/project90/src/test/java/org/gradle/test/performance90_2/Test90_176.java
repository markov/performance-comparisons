package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_176 {
    private final Production90_176 production = new Production90_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}