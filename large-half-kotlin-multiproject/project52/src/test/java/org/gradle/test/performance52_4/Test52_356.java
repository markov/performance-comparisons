package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_356 {
    private final Production52_356 production = new Production52_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}