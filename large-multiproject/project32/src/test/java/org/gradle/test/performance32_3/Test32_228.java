package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_228 {
    private final Production32_228 production = new Production32_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}