package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_473 {
    private final Production71_473 production = new Production71_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}