package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_437 {
    private final Production71_437 production = new Production71_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}