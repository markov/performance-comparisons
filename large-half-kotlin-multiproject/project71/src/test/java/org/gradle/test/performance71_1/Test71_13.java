package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_13 {
    private final Production71_13 production = new Production71_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}