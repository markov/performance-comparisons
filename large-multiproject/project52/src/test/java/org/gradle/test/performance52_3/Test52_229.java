package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_229 {
    private final Production52_229 production = new Production52_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}