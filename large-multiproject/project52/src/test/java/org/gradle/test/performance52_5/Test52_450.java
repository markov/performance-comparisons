package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_450 {
    private final Production52_450 production = new Production52_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}