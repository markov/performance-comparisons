package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_78 {
    private final Production32_78 production = new Production32_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}