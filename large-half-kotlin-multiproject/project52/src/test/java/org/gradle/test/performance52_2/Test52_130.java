package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_130 {
    private final Production52_130 production = new Production52_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}