package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_126 {
    private final Production86_126 production = new Production86_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}