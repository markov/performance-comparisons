package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_152 {
    private final Production97_152 production = new Production97_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}