package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_146 {
    private final Production85_146 production = new Production85_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}