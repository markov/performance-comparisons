package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_62 {
    private final Production85_62 production = new Production85_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}