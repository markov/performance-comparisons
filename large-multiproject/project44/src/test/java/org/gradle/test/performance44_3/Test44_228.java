package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_228 {
    private final Production44_228 production = new Production44_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}