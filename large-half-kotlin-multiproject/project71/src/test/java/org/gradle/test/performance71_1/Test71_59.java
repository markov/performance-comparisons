package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_59 {
    private final Production71_59 production = new Production71_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}