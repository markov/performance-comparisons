package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_208 {
    private final Production66_208 production = new Production66_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}