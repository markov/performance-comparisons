package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_431 {
    private final Production52_431 production = new Production52_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}