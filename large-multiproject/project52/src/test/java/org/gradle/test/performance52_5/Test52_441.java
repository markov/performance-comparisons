package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_441 {
    private final Production52_441 production = new Production52_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}