package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_344 {
    private final Production70_344 production = new Production70_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}