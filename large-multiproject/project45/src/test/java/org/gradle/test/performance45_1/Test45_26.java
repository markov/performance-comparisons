package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_26 {
    private final Production45_26 production = new Production45_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}