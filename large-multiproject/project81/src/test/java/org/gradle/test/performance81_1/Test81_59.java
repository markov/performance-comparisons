package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_59 {
    private final Production81_59 production = new Production81_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}